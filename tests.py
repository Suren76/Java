from typing import overload


class TestC:
    def get_n(self, value: int):
        return value

    def get_n(self, value: str):
        return value
    pass

