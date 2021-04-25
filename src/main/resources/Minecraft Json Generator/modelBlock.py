def block(modid, name):
  return {
    "parent": "block/cube_all",
    "textures": {
      "all": modid + ":blocks/" + name
    }
  }

def stairs(modid, name, vanilla):
  # for the stairs, I need to return three models, in order; stairs, stairs_outer and stairs_inner
  if vanilla == True:
    # for adding shapes to vanilla blocks
    return [{
      "parent": "block/stairs",
      "textures": {
        "bottom": "block/" + name,
        "top": "block/" + name,
        "side": "block/" + name
      }
      },{
      "parent": "block/outer_stairs",
      "textures": {
        "bottom": "block/" + name,
        "top": "block/" + name,
        "side": "block/" + name
        }
      },{
      "parent": "block/inner_stairs",
      "textures": {
        "bottom": "block/" + name,
        "top": "block/" + name,
        "side": "block/" + name
        }
      }
    ]
  else:
    return [{
      "parent": "block/stairs",
      "textures": {
        "bottom": modid + ":blocks/" + name,
        "top": modid + ":blocks/" + name,
        "side": modid + ":blocks/" + name
      }
      },{
      "parent": "block/outer_stairs",
      "textures": {
        "bottom": modid + ":blocks/" + name,
        "top": modid + ":blocks/" + name,
        "side": modid + ":blocks/" + name
        }
      },{
      "parent": "block/inner_stairs",
      "textures": {
        "bottom": modid + ":blocks/" + name,
        "top": modid + ":blocks/" + name,
        "side": modid + ":blocks/" + name
        }
      }
    ]

def slab(modid, name, vanilla):
  # slabs need the slab and the slab_top
  if vanilla == True:
    # for adding shapes to vanilla blocks
    return [{
      "parent": "block/slab",
      "textures": {
        "bottom": "block/" + name,
        "top": "block/" + name,
        "side": "block/" + name
      }
    },{
      "parent": "block/slab_top",
      "textures": {
        "bottom": "block/" + name,
        "top": "block/" + name,
        "side": "block/" + name
      }
    }]
  else:
    return [{
      "parent": "block/slab",
      "textures": {
        "bottom": modid + ":blocks/" + name,
        "top": modid + ":blocks/" + name,
        "side": modid + ":blocks/" + name
      }
    },{
      "parent": "block/slab_top",
      "textures": {
        "bottom": modid + ":blocks/" + name,
        "top": modid + ":blocks/" + name,
        "side": modid + ":blocks/" + name
      }
    }]

def step(modid, name, vanilla):
  # steps require the step and the vertical
  if vanilla == True:
    # for adding shapes to vanilla blocks
    return [
      {
        "parent": modid + ":block/step",
        "textures": {
          "0": "block/" + name,
          "particle": "block/" + name
        }
      },{
        "parent": modid + ":block/step_vertical",
        "textures": {
          "0": "block/" + name,
          "particle": "block/" + name
        }
      }
    ]
  else:
    return [
      {
        "parent": modid + ":block/step",
        "textures": {
          "0": modid + ":blocks/" + name,
          "particle": modid + ":blocks/" + name
        }
      },{
        "parent": modid + ":block/step_vertical",
        "textures": {
          "0": modid + ":blocks/" + name,
          "particle": modid + ":blocks/" + name
        }
      }
    ]

def vertical_slab(modid, name, vanilla):
  if vanilla == True:
    # for adding shapes to vanilla blocks{
    return {
      "parent": modid + ":block/vertical_slab",
      "textures":{
        "0":"block/" + name,
        "particle":"block/" + name
      }
    }
  else:
    return {
      "parent": modid + ":block/vertical_slab",    
      "textures":{
        "0": modid + ":blocks/" + name,
        "particle": modid + ":blocks/" + name
      }
    }

def button(modid, name, vanilla):
  # button, pressed and inventory
  if vanilla == True:
    return [
      {
        "parent": "block/button",
        "textures": {
          "texture": ":block/" + name
        }
      },{
        "parent": "block/button_pressed",
        "textures": {
          "texture": ":block/" + name
        }
      },{
        "parent": "block/button_inventory",
        "textures": {
          "texture": ":block/" + name
        }
      }
    ]
  else:
    return [
      {
        "parent": "block/button",
        "textures": {
          "texture": modid + ":blocks/" + name
        }
      },{
        "parent": "block/button_pressed",
        "textures": {
          "texture": modid + ":blocks/" + name
        }
      },{
        "parent": "block/button_inventory",
        "textures": {
          "texture": modid + ":blocks/" + name
        }
      }
    ]

def fence(modid, name):
  # fences need the post, side and inventory
  return [
    {
      "parent": "block/fence_post",
      "textures": {
        "texture": modid + ":blocks/" + name
      }
    },{
      "parent": "block/fence_side",
      "textures": {
        "texture": modid + ":blocks/" + name
      }
    },{
      "parent": "block/fence_inventory",
      "textures": {
        "texture": modid + ":blocks/" + name
      }
    }
  ]

def pressure_plate(modid, name):
  # normal and down
  return [{
      "parent": "block/pressure_plate_up",
      "textures": {
        "texture": modid + ":blocks/" + name
      }
    },{
      "parent": "block/pressure_plate_down",
      "textures": {
        "texture": modid + ":blocks/" + name
      }
    }
  ]
  
def sapling(modid, name):
  return {
    "parent": "block/cross",
    "textures": {
      "cross": modid + ":blocks/" + name + "_sapling"
    }
  }

def wall(modid, name, vanilla):
  if vanilla == True:
    # Post, side, and inventory
    return [{
        "parent": "block/template_wall_post",
        "textures": {
          "wall":":block/" + name
        }
      },{
        "parent": "block/template_wall_side",
        "textures": {
          "wall":":block/" + name
        }
      },{
        "parent": "block/wall_inventory",
        "textures": {
          "wall":":block/" + name
        }
      }
    ]
  else:
    # Post, side, and inventory
    return [{
        "parent": "block/template_wall_post",
        "textures": {
          "wall": modid + ":blocks/" + name
        }
      },{
        "parent": "block/template_wall_side",
        "textures": {
          "wall": modid + ":blocks/" + name
        }
      },{
        "parent": "block/wall_inventory",
        "textures": {
          "wall": modid + ":blocks/" + name
        }
      }
    ]

def leaves(modid, name):
  return {
    "parent": "block/cube_all",
    "textures": {
      "all": modid + ":blocks/" + name + "_leaves"
    }
  }

def log(modid, name):
  return {
    "parent": "block/cube_column",
    "textures": {
      "end": modid + ":blocks/" + name + "_log_top",
      "side": modid + ":blocks/" + name + "_log"
    }
  }

def carpet(modid, name, vanilla):
  if vanilla == True:
    # for adding shapes to vanilla blocks
    return {
      "parent": "jpsbase:block/carpet",    
      "textures":{
        "0":"block/" + name,
        "particle": "block/" + name
      }
    }
  else:
    return {
      "parent": "jpsbase:block/carpet",    
      "textures":{
        "0": modid + ":blocks/" + name + "_leaves",
        "particle": modid + ":blocks/" + name + "_leaves"
      }
    }