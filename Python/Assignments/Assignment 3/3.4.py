# Q.4. Decorate the display_greeting() function using a decorator so that greeting is displayed in uppercase

def CapsLock(func):
    def wrapper():
        original_output = func()
        return original_output.upper()
    return wrapper


@CapsLock
def display_greeting():
    return ("good morning!")

print(display_greeting())