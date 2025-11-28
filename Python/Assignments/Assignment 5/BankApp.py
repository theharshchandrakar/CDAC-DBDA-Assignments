import datetime
from abc import ABC, abstractmethod

class BankingException(Exception):
    pass

class InsufficientFundsError(BankingException):
    pass

class DepositLimitExceededError(BankingException):
    pass

class InvalidAmountError(BankingException):
    pass

class AccountNotFoundError(BankingException):
        pass

class Account(ABC):
    def __init__(self, acc_id: str, name: str, balance: float = 0.0):
        if not isinstance(acc_id, str) or not acc_id:
            raise ValueError("Account ID must be a non-empty string.")
        if not isinstance(name, str) or not name:
            raise ValueError("Account name must be a non-empty string.")
        if not isinstance(balance, (int, float)) or balance < 0:
            raise ValueError("Initial balance cannot be negative.")

        self.acc_id = acc_id
        self.name = name
        self.balance = float(balance)

    @abstractmethod
    def withdraw(self, amount: float) -> float:
        pass

    @abstractmethod
    def deposit(self, amount: float) -> float:
        pass
    
    def __str__(self) -> str:
        return (f"Account ID: {self.acc_id}, Name: {self.name}, "
                f"Balance: ${self.balance:,.2f}")


class SavingsAccount(Account):
    MIN_BALANCE = 5000.0
    MAX_DEPOSIT = 100000.0

    def __init__(self, acc_id: str, name: str, balance: float, type: str):
        super().__init__(acc_id, name, balance)
        if type.lower() not in ['personal', 'corporate']:
            raise ValueError("Account type must be 'personal' or 'corporate'.")
        self.type = type.lower()

    def deposit(self, amount: float) -> float:
        if amount <= 0:
            raise InvalidAmountError("Deposit amount must be positive.")
        if amount > self.MAX_DEPOSIT:
            raise DepositLimitExceededError(
                f"Deposit failed. Maximum deposit is ${self.MAX_DEPOSIT:,.2f}."
            )
        self.balance += amount
        return self.balance

    def withdraw(self, amount: float) -> float:
        if amount <= 0:
            raise InvalidAmountError("Withdrawal amount must be positive.")
        if amount > self.balance:
            raise InsufficientFundsError("Withdrawal amount exceeds current balance.")

        if self.type == 'corporate':
            self.balance -= amount
            return self.balance

        if (self.balance - amount) < self.MIN_BALANCE:
            raise InsufficientFundsError(
                f"Withdrawal failed. Minimum balance of ${self.MIN_BALANCE:,.2f} must be maintained."
            )
        self.balance -= amount
        return self.balance

class CurrentAccount(Account):
    MIN_BALANCE = 10000.0
    MAX_DEPOSIT = 200000.0

    def deposit(self, amount: float) -> float:
        if amount <= 0:
            raise InvalidAmountError("Deposit amount must be positive.")
        if amount > self.MAX_DEPOSIT:
            raise DepositLimitExceededError(
                f"Deposit failed. Maximum deposit is ${self.MAX_DEPOSIT:,.2f}."
            )
        self.balance += amount
        return self.balance

    def withdraw(self, amount: float) -> float:
        if amount <= 0:
            raise InvalidAmountError("Withdrawal amount must be positive.")
        if (self.balance - amount) < self.MIN_BALANCE:
            raise InsufficientFundsError(
                f"Withdrawal failed. Minimum balance of ${self.MIN_BALANCE:,.2f} must be maintained."
            )
        self.balance -= amount
        return self.balance

