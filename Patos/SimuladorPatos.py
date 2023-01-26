class Duck:
    def swin(self):
        print( "* Nada epicamente *" )
    def display(self):
        pass
    def quack():
        def quack(self):
            print("* Quackea *")
    def fly():
        def fly(self):
            print("* vuela epicamente *")


class FlyWithWings():
    def fly(self):
        print("* vuela epicamente con alas *")

class FlyNoWay():
    def fly(self):
        print("* no vuela epicamente *")

class FlyWithBallon():
    def fly(self):
        print("* vuela epicamente con globos *")

class Quack():
    def quack(self):
        print("* QUACK *")

class Squeak():
    def quack(self):
        print("* chilla ... chilla ... *")

class MuteQuack():
    def quack(self):
        print("* no hace ningun ruido ... *")

class MallardDuck(Duck):
    def display(self):
        print(" Look at me!: https://www.pngmart.com/files/6/Mallard-PNG-Pic.png ")
    def quack(self):
        print("* QUACK *")
    def fly(self):
        print("* vuela epicamente *")

class RedheadDuck(Duck):
    def display(self):
        print(" Look at me!: https://shootingsportsman.com/wp-content/uploads/2020/10/diver-dredhead-web.png ")
    def fly(self):
        print("* no vuela epicamente *")
    def quack(self):
        print("* vuela epicamente *")
    
class RubberDuck(Duck):
    def display(self):
        print(" Look at me!: https://www.freepnglogos.com/uploads/rubber-duck-png/rubber-duck-duck-png-transparent-images-pictures-photos-1.png ")
    def fly(self):
        print("* vuela epicamente *")
    def quack(self):
        print("* QUACK *")
    

class DecoyDuck(Duck):
    def display(self):
        print(" Look at me!: https://chairish-prod.freetls.fastly.net/image/product/master/781f9bed-6114-48ea-baf9-7bce4fc07b19/early-1900s-wood-hand-painted-decoy-ducks-set-of-5-9286 ")
    def fly(self):
        print("* no vuela epicamente *")
    def quack(self):
        print("* no hace ningun ruido ... *")

class BalloonDuck(Duck):
    def display(self):
        print(" Look at me!: https://img.favpng.com/25/10/8/rubber-duck-toy-balloon-natural-rubber-png-favpng-1W5vyKqM5x4My4pD2jdr9Sf5M.jpg ")
    def fly(self):
        print("* vuela epicamente con globos *")
    def quack(self):
        print("* chilla ... chilla ... *")

if __name__ == '__main__':
    print("\nMallard Duck")
    pato = MallardDuck()
    pato.display()
    pato.swin()
    pato.quack()
    pato.fly()

    print("\nRedHead Duck")
    pato2 = RedheadDuck()
    pato2.display()
    pato2.swin()
    pato2.quack()
    pato2.fly()

    print("\nRubber Duck")
    pato3 = RubberDuck()
    pato3.display()
    pato3.swin()
    pato3.quack()
    pato3.fly()

    print("\nDecoy Duck")
    pato4 = DecoyDuck()
    pato4.display()
    pato4.swin()
    pato4.quack()
    pato4.fly()

    print("\nBalloon Duck")
    pato5 = BalloonDuck()
    pato5.display()
    pato5.swin()
    pato5.quack()
    pato5.fly()