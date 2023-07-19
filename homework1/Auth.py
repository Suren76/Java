from homework1.User import User


class Auth:
    users: dict
    session: dict

    def __init__(self, users: list):
        for _ in users:
            self.register(user=_)

    def register(self, user: User = None,  email=None, name=None, gender=None, birthday=None, address=None, uname=None, pwd=None, phone_number=None):
        if user.uname in self.users.keys() or uname in self.users.keys():
            raise RuntimeError

        if user is not None:
            self.users[user.uname] = user
            self.session[user.uname] = "registered"
        if list({email, name, gender, birthday, address, uname, pwd, phone_number})[0] is not None:
            self.users[uname] = User(email=email, name=name, gender=gender, birthday=birthday, address=address, uname=uname, pwd=pwd, phone_number=phone_number)
            self.session[uname] = "registered"

    def login(self, username, password):
        if username in self.users.keys():
            if password == self.users[username].pwd:
                self.session[username] = "logged in"
                return True
        return False

    def logout(self, username):
        self.session[username] = "logged out" if username in self.users.keys() else "no user"

    def status(self, username):
        return self.session.get(username) if username in self.users.keys() else "no user"
