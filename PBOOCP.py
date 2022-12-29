class Pengguna:

  def __init__(self, username: str, umur: int):
      self.username = username
      self.umur = umur

  def __repr__(self):
      return f"Pelanggan: {self.username}, {self.umur} tahun"


class Pelanggan(Pengguna):

  def __init__(self, username: str, umur: int, makanan_favorit: str):
      super().__init__(username, umur)
      self.makanan_favorit = makanan_favorit
      
  def __repr__(self):
    return f"Pengguna: {self.username}, {self.umur} tahun, makanan favorit: {self.makanan_favorit}"