import basic_calculator


class AdvancedCalculator(basic_calculator.BasicCalculator):
    def __init__(self, number):
        basic_calculator.BasicCalculator.__init__(self, number)

    def sqr(self):
        self.value = self.value ** 0.5
    