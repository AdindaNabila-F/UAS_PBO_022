class P:
  
  def __init__(self, phi: list):
    self.phi = phi
    
class Q(P):
  pass

if __name__ == "__main__":
  x = P(phi=["a", "b"])
  y = Q(phi=["c", "d"])