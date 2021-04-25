def block(modid, name):
  return {
    "variants": {
      "":{ "model": modid + ":block/" + name }
    }
  }

def stairs(modid, name):
  name = name + "_stairs"
  return {
    "variants": {
      "facing=east,half=bottom,shape=straight":  { "model": modid + ":block/" + name },
      "facing=west,half=bottom,shape=straight":  { "model": modid + ":block/" + name, "y": 180, "uvlock": True },
      "facing=south,half=bottom,shape=straight": { "model": modid + ":block/" + name, "y": 90, "uvlock": True },
      "facing=north,half=bottom,shape=straight": { "model": modid + ":block/" + name, "y": 270, "uvlock": True },
      "facing=east,half=bottom,shape=outer_right":  { "model": modid + ":block/" + name + "_outer" },
      "facing=west,half=bottom,shape=outer_right":  { "model": modid + ":block/" + name + "_outer", "y": 180, "uvlock": True },
      "facing=south,half=bottom,shape=outer_right": { "model": modid + ":block/" + name + "_outer", "y": 90, "uvlock": True },
      "facing=north,half=bottom,shape=outer_right": { "model": modid + ":block/" + name + "_outer", "y": 270, "uvlock": True },
      "facing=east,half=bottom,shape=outer_left":  { "model": modid + ":block/" + name + "_outer", "y": 270, "uvlock": True },
      "facing=west,half=bottom,shape=outer_left":  { "model": modid + ":block/" + name + "_outer", "y": 90, "uvlock": True },
      "facing=south,half=bottom,shape=outer_left": { "model": modid + ":block/" + name + "_outer" },
      "facing=north,half=bottom,shape=outer_left": { "model": modid + ":block/" + name + "_outer", "y": 180, "uvlock": True },
      "facing=east,half=bottom,shape=inner_right":  { "model": modid + ":block/" + name + "_inner" },
      "facing=west,half=bottom,shape=inner_right":  { "model": modid + ":block/" + name + "_inner", "y": 180, "uvlock": True },
      "facing=south,half=bottom,shape=inner_right": { "model": modid + ":block/" + name + "_inner", "y": 90, "uvlock": True },
      "facing=north,half=bottom,shape=inner_right": { "model": modid + ":block/" + name + "_inner", "y": 270, "uvlock": True },
      "facing=east,half=bottom,shape=inner_left":  { "model": modid + ":block/" + name + "_inner", "y": 270, "uvlock": True },
      "facing=west,half=bottom,shape=inner_left":  { "model": modid + ":block/" + name + "_inner", "y": 90, "uvlock": True },
      "facing=south,half=bottom,shape=inner_left": { "model": modid + ":block/" + name + "_inner" },
      "facing=north,half=bottom,shape=inner_left": { "model": modid + ":block/" + name + "_inner", "y": 180, "uvlock": True },
      "facing=east,half=top,shape=straight":  { "model": modid + ":block/" + name, "x": 180, "uvlock": True },
      "facing=west,half=top,shape=straight":  { "model": modid + ":block/" + name, "x": 180, "y": 180, "uvlock": True },
      "facing=south,half=top,shape=straight": { "model": modid + ":block/" + name, "x": 180, "y": 90, "uvlock": True },
      "facing=north,half=top,shape=straight": { "model": modid + ":block/" + name, "x": 180, "y": 270, "uvlock": True },
      "facing=east,half=top,shape=outer_right":  { "model": modid + ":block/" + name + "_outer", "x": 180, "y": 90, "uvlock": True },
      "facing=west,half=top,shape=outer_right":  { "model": modid + ":block/" + name + "_outer", "x": 180, "y": 270, "uvlock": True },
      "facing=south,half=top,shape=outer_right": { "model": modid + ":block/" + name + "s_outer", "x": 180, "y": 180, "uvlock": True },
      "facing=north,half=top,shape=outer_right": { "model": modid + ":block/" + name + "_outer", "x": 180, "uvlock": True },
      "facing=east,half=top,shape=outer_left":  { "model": modid + ":block/" + name + "_outer", "x": 180, "uvlock": True },
      "facing=west,half=top,shape=outer_left":  { "model": modid + ":block/" + name + "_outer", "x": 180, "y": 180, "uvlock": True },
      "facing=south,half=top,shape=outer_left": { "model": modid + ":block/" + name + "_outer", "x": 180, "y": 90, "uvlock": True },
      "facing=north,half=top,shape=outer_left": { "model": modid + ":block/" + name + "_outer", "x": 180, "y": 270, "uvlock": True },
      "facing=east,half=top,shape=inner_right":  { "model": modid + ":block/" + name + "_inner", "x": 180, "y": 90, "uvlock": True },
      "facing=west,half=top,shape=inner_right":  { "model": modid + ":block/" + name + "_inner", "x": 180, "y": 270, "uvlock": True },
      "facing=south,half=top,shape=inner_right": { "model": modid + ":block/" + name + "_inner", "x": 180, "y": 180, "uvlock": True },
      "facing=north,half=top,shape=inner_right": { "model": modid + ":block/" + name + "_inner", "x": 180, "uvlock": True },
      "facing=east,half=top,shape=inner_left":  { "model": modid + ":block/" + name + "_inner", "x": 180, "uvlock": True },
      "facing=west,half=top,shape=inner_left":  { "model": modid + ":block/" + name + "_inner", "x": 180, "y": 180, "uvlock": True },
      "facing=south,half=top,shape=inner_left": { "model": modid + ":block/" + name + "_inner", "x": 180, "y": 90, "uvlock": True },
      "facing=north,half=top,shape=inner_left": { "model": modid + ":block/" + name + "_inner", "x": 180, "y": 270, "uvlock": True }
    }
  }

def slab(modid, name, vanilla):
  if vanilla == True:
    return {
      "variants": {
        "type=bottom": { "model": modid + ":block/" + name + "_slab" },
        "type=top": { "model": modid + ":block/" + name + "_slab_top" },
        "type=double": { "model": "minecraft:block/" + name }
      }
    }
  else:
    return {
      "variants": {
        "type=bottom": { "model": modid + ":block/" + name + "_slab" },
        "type=top": { "model": modid + ":block/" + name + "_slab_top" },
        "type=double": { "model": modid + ":block/" + name } # + "_block" 
      }
    }

def step(modid, name):
  name = name + "_step"
  return {
    "variants": {
      "orientation=bn": { "model": modid + ":block/" + name},
      "orientation=be": { "model": modid + ":block/" + name, "y": 90, "uvlock": True },
      "orientation=bs": { "model": modid + ":block/" + name, "x": 90, "uvlock": True },
      "orientation=bw": { "model": modid + ":block/" + name, "y": 270, "uvlock": True },
      "orientation=tn": { "model": modid + ":block/" + name, "x": 270, "uvlock": True },
      "orientation=te": { "model": modid + ":block/" + name, "x": 270, "y": 90, "uvlock": True },
      "orientation=ts": { "model": modid + ":block/" + name, "x": 270, "y": 180, "uvlock": True },
      "orientation=tw": { "model": modid + ":block/" + name, "x": 270, "y": 270, "uvlock": True },
      "orientation=ne": { "model": modid + ":block/" + name + "_vertical", "y": 90, "uvlock": True },
      "orientation=nw": { "model": modid + ":block/" + name + "_vertical" },
      "orientation=se": { "model": modid + ":block/" + name + "_vertical", "y": 180, "uvlock": True },
      "orientation=sw": { "model": modid + ":block/" + name + "_vertical", "y": 270, "uvlock": True }
    }
  }

def vertical_slab(modid, name):
  name = name + "_vertical_slab"
  return {
    "variants": {
      "facing=north": { "model": modid + ":block/" + name, "y": 180  },
      "facing=east":  { "model": modid + ":block/" + name, "y": 270 },
      "facing=south": { "model": modid + ":block/" + name},
      "facing=west":  { "model": modid + ":block/" + name, "y": 90 }
    }
  }

def button(modid, name):
  name = name + "_button"
  return {
    "variants": {
      "face=floor,facing=east,powered=false":  { "model": modid + ":block/" + name, "y": 90 },
      "face=floor,facing=west,powered=false":  { "model": modid + ":block/" + name, "y": 270 },
      "face=floor,facing=south,powered=false": { "model": modid + ":block/" + name, "y": 180 },
      "face=floor,facing=north,powered=false": { "model": modid + ":block/" + name },
      "face=wall,facing=east,powered=false":  { "model": modid + ":block/" + name, "uvlock": True, "x": 90, "y": 90 },
      "face=wall,facing=west,powered=false":  { "model": modid + ":block/" + name, "uvlock": True, "x": 90, "y": 270 },
      "face=wall,facing=south,powered=false": { "model": modid + ":block/" + name, "uvlock": True, "x": 90, "y": 180 },
      "face=wall,facing=north,powered=false": { "model": modid + ":block/" + name, "uvlock": True, "x": 90 },
      "face=ceiling,facing=east,powered=false":  { "model": modid + ":block/" + name, "x": 180, "y": 270 },
      "face=ceiling,facing=west,powered=false":  { "model": modid + ":block/" + name, "x": 180, "y": 90 },
      "face=ceiling,facing=south,powered=false": { "model": modid + ":block/" + name, "x": 180 },
      "face=ceiling,facing=north,powered=false": { "model": modid + ":block/" + name, "x": 180, "y": 180 },
      "face=floor,facing=east,powered=true":  { "model": modid + ":block/" + name + "_pressed", "y": 90 },
      "face=floor,facing=west,powered=true":  { "model": modid + ":block/" + name + "_pressed", "y": 270 },
      "face=floor,facing=south,powered=true": { "model": modid + ":block/" + name + "_pressed", "y": 180 },
      "face=floor,facing=north,powered=true": { "model": modid + ":block/" + name + "_pressed" },
      "face=wall,facing=east,powered=true":  { "model": modid + ":block/" + name + "_pressed", "uvlock": True, "x": 90, "y": 90 },
      "face=wall,facing=west,powered=true":  { "model": modid + ":block/" + name + "_pressed", "uvlock": True, "x": 90, "y": 270 },
      "face=wall,facing=south,powered=true": { "model": modid + ":block/" + name + "_pressed", "uvlock": True, "x": 90, "y": 180 },
      "face=wall,facing=north,powered=true": { "model": modid + ":block/" + name + "_pressed", "uvlock": True, "x": 90 },
      "face=ceiling,facing=east,powered=true":  { "model": modid + ":block/" + name + "_pressed", "x": 180, "y": 270 },
      "face=ceiling,facing=west,powered=true":  { "model": modid + ":block/" + name + "_pressed", "x": 180, "y": 90 },
      "face=ceiling,facing=south,powered=true": { "model": modid + ":block/" + name + "_pressed", "x": 180 },
      "face=ceiling,facing=north,powered=true": { "model": modid + ":block/" + name + "_pressed", "x": 180, "y": 180 }
    }
  }

def fence(modid, name):
  return {
    "multipart": [
      { "apply": { "model": modid + ":block/" + name + "_fence_post" }},
      { "when": { "north": "true" },
        "apply": { "model": modid + ":block/" + name + "_fence_side", "uvlock": True }
      },
      { "when": { "east": "true" },
        "apply": { "model": modid + ":block/" + name + "_fence_side", "y": 90, "uvlock": True }
      },
      { "when": { "south": "true" },
        "apply": { "model": modid + ":block/" + name + "_fence_side", "y": 180, "uvlock": True }
      },
      { "when": { "west": "true" },
        "apply": { "model": modid + ":block/" + name + "_fence_side", "y": 270, "uvlock": True }
      }
    ]
  }

def pressure_plate(modid, name):
  return {
    "variants": {
      "powered=false": { "model": modid + ":block/" + name + "_pressure_plate" },
      "powered=true": { "model": modid + ":block/" + name + "_pressure_plate_down" }
    }
  }

def sapling(modid, name):
  return {
    "variants": {
      "":{ "model":modid + ":block/" + name + "_sapling" }
    }
  }

def wall(modid, name):
  return {
    "multipart": [
      { "when": { "up": "true" },
        "apply": { "model": modid + ":block/" + name + "_wall_post" }
      },
      { "when": { "north": "true" },
        "apply": { "model": modid + ":block/" + name + "_wall_side", "uvlock": True }
      },
      { "when": { "east": "true" },
        "apply": { "model": modid + ":block/" + name + "_wall_side", "y": 90, "uvlock": True }
      },
      { "when": { "south": "true" },
        "apply": { "model": modid + ":block/" + name + "_wall_side", "y": 180, "uvlock": True }
      },
      { "when": { "west": "true" },
        "apply": { "model": modid + ":block/" + name + "_wall_side", "y": 270, "uvlock": True }
      }
    ]
  }

def leaves(modid, name):
  return {
    "variants": {
      "":{ "model":modid + ":block/" + name + "_leaves" }
    }
  }

def log(modid, name):
  return {
    "variants": {
      "axis=y": { "model": modid + ":block/" + name + "_log" },
      "axis=z": { "model": modid + ":block/" + name + "_log", "x": 90 },
      "axis=x": { "model": modid + ":block/" + name + "_log", "x": 90, "y": 90 }
    }
  }

def carpet(modid, name):
  return {
    "variants": {
      "":{ "model": modid + ":block/" + name + "_carpet" }
    }
  }

