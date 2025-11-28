from Bank import BankApp
from BankApp import SavingsAccount, CurrentAccount, AccountNotFoundError, BankingException


def _account_menu(app: BankApp, acc_id: str):
    """Displays and handles the menu for a specific account."""
    while True:
        print("\n--- Menu ---")
        print("1. Deposit")
        print("2. Withdraw")
        print("3. Back to main menu")
        choice = input("Choose an option: ").strip()

        if choice == '1':  # Deposit
            try:
                amount = float(input("Enter amount to deposit: ").strip())
                app.deposit_to_account(acc_id, amount)
            except ValueError:
                print("\nERROR: Please enter a valid number for the amount.")
            except BankingException:
                # Specific error is already printed by the deposit method
                pass
        elif choice == '2':  # Withdraw
            try:
                amount = float(input("Enter amount to withdraw: ").strip())
                app.withdraw_from_account(acc_id, amount)
            except ValueError:
                print("\nERROR: Please enter a valid number for the amount.")
            except BankingException:
                # Specific error is already printed by the withdraw method
                pass
        elif choice == '3':
            break
        else:
            print("Invalid option. Please try again.")


def run_user_interface(app: BankApp):
    """The main user interface loop for the application."""
    print("\nWelcome to the Bank App!")
    while True:
        acc_id = input("\nEnter your Account ID (or 'exit' to quit): ").strip()
        if acc_id.lower() == 'exit':
            break

        try:
            account = app.get_account(acc_id)
            print(f"\nWelcome, {account.name}. Current Balance: ${account.balance:,.2f}")
            _account_menu(app, acc_id)
        except AccountNotFoundError as e:
            print(f"\nERROR: {e}")

    # After user exits
    app.print_statement()
    app.print_final_balances()
    print("\nThank you for using the Bank App!")


if __name__ == "__main__":
    # 1. Create a BankApp instance
    app = BankApp()

    # 2. Create and add some accounts
    try:
        s_acct_personal = SavingsAccount("S101", "Alice Smith", 25000, "personal")
        s_acct_corp = SavingsAccount("S102", "Biz Corp", 7000, "corporate")
        c_acct = CurrentAccount("C201", "John Doe", 50000)

        app.add_account(s_acct_personal)
        app.add_account(s_acct_corp)
        app.add_account(c_acct)
    except ValueError as e:
        print(f"Error initializing accounts: {e}")

    # 3. Run the application's user interface
    run_user_interface(app)

