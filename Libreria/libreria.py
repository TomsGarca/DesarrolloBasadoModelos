class person:
    def get():
        pass
    def set():
        pass

class page:
    def __init__(self) -> None:
        pass
    def get():
        pass
    def set():
        pass

class reader:
    def __init__(self, person):
        self.reader = person
    def get():
        pass
    def set():
        pass

class book:
    def __init__(self, page):
        self.pages = page
    def get():
        pass
    def set():
        pass

class libraryBook:
    def __init__(self, book):
        self.books = book
    def get():
        pass
    def set():
        pass

class library:
    def __init__(self, libraryBook, reader):
        self.book = libraryBook
        self.read = reader
    def get():
        pass
    def set():
        pass
    