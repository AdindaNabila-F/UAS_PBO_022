class Kucing:
   
    def __init__(self, name):
        self.name = name
   
    def makan(self):
        print(f"{self.name} makan dengan sangat lahap")

    def bermain(self):
        print(f"{self.name} bermain berlarian kesana kemari")

    def bersuara(self) -> str:
        return "Meowmeow"

class berkomunikasi:

    def __init__(self, channel):
        self.channel = channel

    def komunikasi(self, kucing1 : Kucing, kucing2: Kucing):
        sentence1 = f"{kucing1.name}: {kucing1.bersuara()}, halo {kucing2.name}"
        sentence2 = f"{kucing2.name}: {kucing2.bersuara()}, halo {kucing1.name}"
        conversation = [sentence1, sentence2]
        print(*conversation,
              f"(via {self.channel})",
              sep = '\n')