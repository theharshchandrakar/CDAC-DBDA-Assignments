from BankApp import Account, BankingException, AccountNotFoundError
from Transaction import Transaction

class BankApp:
    """
    The main application class that manages accounts and core banking logic.
    """
    def __init__(self):
        self._accounts = {}
        self._transactions = []

    def add_account(self, account: Account):
        """Adds a new account to the bank's registry."""
        self._accounts[account.acc_id] = account
        print(f"Account '{account.name}' ({account.acc_id}) created successfully.")

    def get_account(self, acc_id: str) -> Account:
        """A public helper to retrieve an account, raising an error if not found."""
        account = self._accounts.get(acc_id)
        if not account:
            raise AccountNotFoundError(f"Account with ID '{acc_id}' not found.")
        return account

    def deposit_to_account(self, acc_id: str, amount: float) -> float:
        """Handles the deposit logic, including transaction logging."""
        try:
            account = self.get_account(acc_id)
            new_balance = account.deposit(amount)
            message = "Deposit successful."
            trans = Transaction(acc_id, "deposit", amount, "Success", new_balance, message)
            print(f"\nSUCCESS: {message} New balance: ${new_balance:,.2f}")
            self._transactions.append(trans)
            return new_balance
        except BankingException as e:
            message = str(e)
            trans = Transaction(acc_id, "deposit", amount, "Failed", message=message)
            print(f"\nERROR: {message}")
            self._transactions.append(trans)
            raise # Re-raise exception to signal failure to the caller

    def withdraw_from_account(self, acc_id: str, amount: float) -> float:
        """Handles the withdrawal logic, including transaction logging."""
        try:
            account = self.get_account(acc_id)
            new_balance = account.withdraw(amount)
            message = "Withdrawal successful."
            trans = Transaction(acc_id, "withdraw", amount, "Success", new_balance, message)
            print(f"\nSUCCESS: {message} New balance: ${new_balance:,.2f}")
            self._transactions.append(trans)
            return new_balance
        except BankingException as e:
            message = str(e)
            trans = Transaction(acc_id, "withdraw", amount, "Failed", message=message)
            print(f"\nERROR: {message}")
            self._transactions.append(trans)
            raise

    def print_statement(self):
        """Prints a detailed statement of all transactions."""
        print("\n" + "="*80)
        print(f"{'TRANSACTION STATEMENT':^80}")
        print("="*80)
        if not self._transactions:
            print("No transactions recorded.")
        else:
            for trans in self._transactions:
                print(trans)
        print("-" * 80)

    def print_final_balances(self):
        """Prints the final balance of all accounts."""
        print("\n" + "="*80)
        print(f"{'FINAL ACCOUNT BALANCES':^80}")
        print("="*80)
        if not self._accounts:
            print("No accounts in the system.")
        else:
            for acc_id, account in self._accounts.items():
                print(f"- {account.name} ({acc_id}): ${account.balance:,.2f}")
        print("-" * 80)

