class BasicCalculator:
    value = 0

    def __init__(self, number):
        self.value = number

    def add(self, number):
        self.value = self.value + number

    def substract(self, number):
        self.value = self.value - number

    def multiply(self, number):
        self.value = self.value * number

    def divide(self, number):
        if number != 0:
            self.value = self.value / number

    def get_value(self):
        return self.value
