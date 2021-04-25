def block(modid, name):
  return {
    "parent": modid + ":block/" + name
  }

def stairs(modid, name):
  return {
    "parent": modid + ":block/" + name + "_stairs"
  }

def slab(modid, name):
  return {
    "parent": modid + ":block/" + name + "_slab"
  }

def step(modid, name):
  return {
    "parent": modid + ":block/" + name + "_step"
  }

def vertical_slab(modid, name):
  return {
    "parent": modid + ":block/" + name + "_vertical_slab"
  }

def button(modid, name):
  return {
    "parent": modid + ":block/" + name + "_button_inventory"
  }

def fence(modid, name):
  return {
    "parent": modid + ":block/" + name + "_fence_inventory"
  }

def pressure_plate(modid, name):
  return {
    "parent": modid + ":block/" + name + "_pressure_plate"
  }

def sapling(modid, name):
  return {
    "parent": "item/generated",
    "textures": {
      "layer0": modid + ":blocks/" + name + "_sapling"
    }
  }

def wall(modid, name):
  return {
    "parent": modid + ":block/" + name + "_wall_inventory"
  }

def leaves(modid, name):
  return {
    "parent":modid + ":block/" + name + "_leaves"
  }

def log(modid, name):
  return {
    "parent":modid + ":block/" + name + "_log"
  }

def carpet(modid, name):
  return {
    "parent":modid + ":block/" + name + "_carpet"
  }