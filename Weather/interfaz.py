 ############## INTERFAZ ##############
import os
import tkinter
from tkinter import *
from tkinter import ttk
 ############## INTERFAZ ##############

class Subject:  #############INTERFAZ###########3
    def __init__(self) -> None:
        self.window = Tk()
        self.window.geometry('720x360')
        self.window.title("SUBJECT")
        self.window.config(bg="lightgray")
        self.window.mainloop()

    def registerObserver():
        pass
    def removeObserver():
        pass
    def notifyObserver():
        pass

class Observer:
    def __init__(self) -> None:
        self.observer = []
    
    def update(self):
        pass

class WheaterData(Subject):

    def __init__(self, temperature:float, humidity:float, preasure:float, observer:list) -> None:
       self.temperature  = temperature
       self.humidity = humidity
       self.preasure = preasure
       self.observer = observer

    def registerObserver(self, observer):
        self.observer.append(observer)
    def removeObserver(self):
        pass
    def notifyObserver(self):
        pass
    def getTemperature(self):
        return self.temperature
    def getHumidity(self):
        return self.humidity
    def getPressearu(self):
        return self.preasure
    def measurementsChanged(self):
        pass



if __name__ == '__main__':
    Subject()