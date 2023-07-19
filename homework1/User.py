class User:
    __email: str
    __name: str
    __gender: str
    __birthday: str
    __address: str
    __uname: str
    __pwd: str
    __phone_number: str

    def __init__(self, email=None, name=None, gender=None, birthday=None, address=None, uname=None, pwd=None, phone_number=None, user=None):
        if email is not None:
            self.__email = email
            self.__name = name
            self.__gender = gender
            self.__birthday = birthday
            self.__address = address
            self.__uname = uname
            self.__pwd = pwd
            self.__phone_number = phone_number

        if user is not None:
            self.__email = user.email
            self.__name = user.name
            self.__gender = user.gender
            self.__birthday = user.birthday
            self.__address = user.address
            self.__uname = user.uname
            self.__pwd = user.pwd
            self.__phone_number = user.phone_number

    @property
    def email(self):
        return self.__email

    @email.setter
    def email(self, email):
        self.__email = email

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, name):
        self.__name = name

    @property
    def gender(self):
        return self.__gender

    @gender.setter
    def gender(self, gender):
        self.__gender = gender

    @property
    def birthday(self):
        return self.__birthday

    @birthday.setter
    def birthday(self, birthday):
        self.__birthday = birthday

    @property
    def address(self):
        return self.__address

    @address.setter
    def address(self, address):
        self.__address = address

    @property
    def uname(self):
        return self.__uname

    @uname.setter
    def uname(self, uname):
        self.__uname = uname

    @property
    def pwd(self):
        return self.__pwd

    @pwd.setter
    def pwd(self, pwd):
        self.__pwd = pwd

    @property
    def phone_number(self):
        return self.__phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        self.__phone_number = phone_number
