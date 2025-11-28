import datetime

class Transaction:
    """A simple class to record the details of each transaction."""
    def __init__(self, account_id: str, trans_type: str, amount: float, status: str, new_balance: float = None, message: str = ""):
        self.timestamp = datetime.datetime.now()
        self.account_id = account_id
        self.trans_type = trans_type.capitalize()
        self.amount = amount
        self.status = status.upper()
        self.new_balance = new_balance
        self.message = message

    def __str__(self):
        """Formats the transaction for the final statement."""
        time_str = self.timestamp.strftime('%Y-%m-%d %H:%M:%S')
        balance_str = f"${self.new_balance:,.2f}" if self.new_balance is not None else "N/A"
        return (f"[{time_str}] Acct: {self.account_id} | {self.trans_type} of ${self.amount:,.2f} | "
                f"Status: {self.status} | New Balance: {balance_str}\n"
                f"    -> {self.message}")

