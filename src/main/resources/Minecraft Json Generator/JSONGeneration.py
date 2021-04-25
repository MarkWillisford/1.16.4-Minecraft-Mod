import json
import loot_tables
import blockstates
import modelBlock
import modelItem

# Inputs
modid = 'jpsbase'
basePath = '../' 
# shapes: block, stairs, slab, step, verticalSlab, 
# button, fence, pressurePlate, sapling,

# The writing method
def writeToJSONFile(path, fileName, data):
    filePathNameWExt = './' + path + '/' + fileName + '.json'
    with open(filePathNameWExt, 'w') as fp:
        json.dump(data, fp, indent=2, sort_keys=True, )

class Item(object):
  def __init__(self, name=None, structure_type=None, shapes=None, vanilla=False):
    self.name = name
    self.structure_type = structure_type
    self.shapes = shapes
    self.vanilla = vanilla

class File(object):
  def __init__(self, name=None, path=None, data=None):
    self.name = name
    self.path = path
    self.data = data
    
listOfItems = []
# listOfItems.append(Item("mahogany", "tree", None, False))
# listOfItems.append(Item("walnut", "tree", None, False))
# listOfItems.append(Item("fir", "tree", None, False))
# listOfItems.append(Item("ancient_tree", "tree", None, False))
# listOfItems.append(Item("pine", "tree", None, False))
# listOfItems.append(Item("wenge", "tree", None, False))
# listOfItems.append(Item("willow", "tree", None, False))
# listOfItems.append(Item("maple", "tree", None, False))
# listOfItems.append(Item("marble", "stone", None, False))
# listOfItems.append(Item("marble_polished", "stone", None, False))
# listOfItems.append(Item("slate", "stone", None, False))
# listOfItems.append(Item("slate_polished", "stone", None, False))
# listOfItems.append(Item("slate_blue", "stone", None, False))
# listOfItems.append(Item("slate_blue_polished", "stone",  None, False))
# listOfItems.append(Item("slate_green", "stone", None, False))
# listOfItems.append(Item("slate_green_polished", "stone", None, False))
# listOfItems.append(Item("slate_purple", "stone", None, False))
# listOfItems.append(Item("slate_purple_polished", "stone", None, False))
# listOfItems.append(Item("slate_red", "stone", None, False))
# listOfItems.append(Item("slate_red_polished", "stone", None, False))
# listOfItems.append(Item("gravel", "none", ["stairs", "slab", "step"], True))
# listOfItems.append(Item("sand", "none", ["stairs", "slab", "step"], True))
# listOfItems.append(Item("coarse_dirt", "none", ["stairs", "slab", "step"], True))
# listOfItems.append(Item("dirt", "none", ["stairs", "slab", "step"], True))     
listOfItems.append(Item("terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("white_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("orange_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("magenta_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("light_blue_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("yellow_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("lime_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("pink_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("gray_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("light_gray_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("cyan_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("purple_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("blue_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("brown_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("green_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("red_terracotta", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("black_terracotta", "none", ["stairs", "slab", "step"], True))

listOfItems.append(Item("white_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("orange_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("magenta_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("light_blue_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("yellow_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("lime_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("pink_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("gray_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("light_gray_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("cyan_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("purple_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("blue_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("brown_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("green_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("red_wool", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("black_wool", "none", ["stairs", "slab", "step"], True))

listOfItems.append(Item("white_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("orange_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("magenta_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("light_blue_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("yellow_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("lime_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("pink_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("gray_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("light_gray_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("cyan_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("purple_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("blue_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("brown_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("green_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("red_concrete", "none", ["stairs", "slab", "step"], True))
listOfItems.append(Item("black_concrete", "none", ["stairs", "slab", "step"], True))
# listOfItems.append(Item("mud", "none", ["block"], False))
# listOfItems.append(Item("mud_wet", "none", ["block"], False))    
# listOfItems.append(Item("cherry", "none", ["log", "wall"], False))      
# listOfItems.append(Item("cherry_planks", "none", ["block","stairs","slab","step","vertical_slab","button","fence","pressure_plate"], False))      
# listOfItems.append(Item("cherry_white", "none", ["leaves", "carpet", "sapling"], False))     
# listOfItems.append(Item("cherry_pink", "none", ["leaves", "carpet", "sapling"], False))  
# listOfItems.append(Item("small_mithral_ore", "none", ["block"], False))     
# listOfItems.append(Item("mithral_ore", "none", ["block"], False))     
# listOfItems.append(Item("small_adamantine_ore", "none", ["block"], False))     
# listOfItems.append(Item("adamantine_ore", "none", ["block"], False))   
# listOfItems.append(Item("ruby_ore", "none", ["block"], False))     
# listOfItems.append(Item("sapphire_ore", "none", ["block"], False))   

listOfFiles = []

switcher_button = {
  "block/button": "",
  "block/button_pressed": "_pressed",
  "block/button_inventory": "_inventory"
}
switcher_stairs = {
  "block/stairs": "",
  "block/outer_stairs": "_outer",
  "block/inner_stairs": "_inner"
}
switcher_slab = {
  "block/slab": "",
  "block/slab_top": "_top"
}
switcher_pressure_plate = {
  "block/pressure_plate_up": "",
  "block/pressure_plate_down": "_down"
}
switcher_fence = {
  "block/fence_post": "_post",
  "block/fence_side": "_side",
  "block/fence_inventory": "_inventory"
}
switcher_step = {
  modid + ":block/step": "",
  modid + ":block/step_vertical": "_vertical"
}
switcher_wall = {
  "block/template_wall_post": "_post",
  "block/template_wall_side": "_side",
  "block/wall_inventory": "_inventory"
}
for item in listOfItems:
  # print( item.name )

  if item.structure_type == "tree":
  # if this is a tree then create all the variant blocks and their files
  # log, leaves, sapling, planks
  # planks_slab, planks_stairs, planks_button, 
  # planks_preasure_plate, planks_step, planks_fence, V-slab
    vanilla = item.vanilla
  
    # Log - just a single return from modelBlock
    listOfFiles.append(File(item.name+"_log", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.log(modid, item.name)))
    listOfFiles.append(File(item.name+"_log", basePath + "/assets/" + modid + "/blockstates", blockstates.log(modid, item.name)))
    listOfFiles.append(File(item.name+"_log", basePath + "/assets/" + modid + "/models/block", modelBlock.log(modid, item.name)))
    listOfFiles.append(File(item.name+"_log", basePath + "/assets/" + modid + "/models/item", modelItem.log(modid, item.name)))

    # wall returns an array from modelBlock
    listOfFiles.append(File(item.name+"_log_wall", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.wall(modid, item.name+"_log")))
    listOfFiles.append(File(item.name+"_log_wall", basePath + "/assets/" + modid + "/blockstates", blockstates.wall(modid, item.name+"_log")))
    listOfFiles.append(File(item.name+"_log_wall", basePath + "/assets/" + modid + "/models/item", modelItem.wall(modid, item.name+"_log")))    
    arr = modelBlock.wall(modid, item.name+"_log", vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_log_wall"+switcher_wall.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # button returns an array from modelBlock
    listOfFiles.append(File(item.name+"_log_button", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.button(modid, item.name+"_log")))
    listOfFiles.append(File(item.name+"_log_button", basePath + "/assets/" + modid + "/blockstates", blockstates.button(modid, item.name+"_log")))
    listOfFiles.append(File(item.name+"_log_button", basePath + "/assets/" + modid + "/models/item", modelItem.button(modid, item.name+"_log")))    
    arr = modelBlock.button(modid, item.name+"_log", vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_log_button"+switcher_button.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))
    
    # Leaves - just a single return from modelBlock
    listOfFiles.append(File(item.name+"_leaves", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.leaves(modid, item.name)))
    listOfFiles.append(File(item.name+"_leaves", basePath + "/assets/" + modid + "/blockstates", blockstates.leaves(modid, item.name)))
    listOfFiles.append(File(item.name+"_leaves", basePath + "/assets/" + modid + "/models/item", modelItem.leaves(modid, item.name)))
    listOfFiles.append(File(item.name+"_leaves", basePath + "/assets/" + modid + "/models/block", modelBlock.leaves(modid, item.name)))

    # Sapling - just a single return from modelBlock
    listOfFiles.append(File(item.name+"_sapling", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.sapling(modid, item.name)))
    listOfFiles.append(File(item.name+"_sapling", basePath + "/assets/" + modid + "/blockstates", blockstates.sapling(modid, item.name)))
    listOfFiles.append(File(item.name+"_sapling", basePath + "/assets/" + modid + "/models/block", modelBlock.sapling(modid, item.name)))
    listOfFiles.append(File(item.name+"_sapling", basePath + "/assets/" + modid + "/models/item", modelItem.sapling(modid, item.name)))

    # the following are all blocks using the planks texture so we can add "_planks" to item.name
    # planks - just a single return from modelBlock after updating the name
    name = item.name+"_planks"
    listOfFiles.append(File(name, basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.block(modid, name)))
    listOfFiles.append(File(name, basePath + "/assets/" + modid + "/blockstates", blockstates.block(modid, name)))
    listOfFiles.append(File(name, basePath + "/assets/" + modid + "/models/block", modelBlock.block(modid, name)))
    listOfFiles.append(File(name, basePath + "/assets/" + modid + "/models/item", modelItem.block(modid, name)))

    # stairs needs a switcher for the models
    listOfFiles.append(File(name+"_stairs", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.stairs(modid, name)))
    listOfFiles.append(File(name+"_stairs", basePath + "/assets/" + modid + "/blockstates", blockstates.stairs(modid, name)))
    listOfFiles.append(File(name+"_stairs", basePath + "/assets/" + modid + "/models/item", modelItem.stairs(modid, name)))
    arr = modelBlock.stairs(modid, name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        name+"_stairs"+switcher_stairs.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # slab needs a switcher for the models
    listOfFiles.append(File(name+"_slab", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.slab(modid, name)))
    listOfFiles.append(File(name+"_slab", basePath + "/assets/" + modid + "/blockstates", blockstates.slab(modid, name)))
    listOfFiles.append(File(name+"_slab", basePath + "/assets/" + modid + "/models/item", modelItem.slab(modid, name)))
    arr = modelBlock.slab(modid, name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        name+"_slab"+switcher_slab.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # button returns an array from modelBlock
    listOfFiles.append(File(name+"_button", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.button(modid, name)))
    listOfFiles.append(File(name+"_button", basePath + "/assets/" + modid + "/blockstates", blockstates.button(modid, name)))
    listOfFiles.append(File(name+"_button", basePath + "/assets/" + modid + "/models/item", modelItem.button(modid, name)))    
    arr = modelBlock.button(modid, name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        name+"_button"+switcher_button.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # pressure plate returns an array from modelBlock
    listOfFiles.append(File(name+"_pressure_plate", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.pressure_plate(modid, name)))
    listOfFiles.append(File(name+"_pressure_plate", basePath + "/assets/" + modid + "/blockstates", blockstates.pressure_plate(modid, name)))
    listOfFiles.append(File(name+"_pressure_plate", basePath + "/assets/" + modid + "/models/item", modelItem.pressure_plate(modid, name)))    
    arr = modelBlock.pressure_plate(modid, name)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        name+"_pressure_plate"+switcher_pressure_plate.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # fence returns an array from modelBlock
    listOfFiles.append(File(name+"_fence", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.fence(modid, name)))
    listOfFiles.append(File(name+"_fence", basePath + "/assets/" + modid + "/blockstates", blockstates.fence(modid, name)))
    listOfFiles.append(File(name+"_fence", basePath + "/assets/" + modid + "/models/item", modelItem.fence(modid, name)))    
    arr = modelBlock.fence(modid, name)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        name+"_fence"+switcher_fence.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # step returns an array from modelBlock
    listOfFiles.append(File(name+"_step", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.step(modid, name)))
    listOfFiles.append(File(name+"_step", basePath + "/assets/" + modid + "/blockstates", blockstates.step(modid, name)))
    listOfFiles.append(File(name+"_step", basePath + "/assets/" + modid + "/models/item", modelItem.step(modid, name)))    
    arr = modelBlock.step(modid, name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        name+"_step"+switcher_step.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # vertical slab returns a single object from modelBlock
    listOfFiles.append(File(name+"_vertical_slab", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.vertical_slab(modid, name)))
    listOfFiles.append(File(name+"_vertical_slab", basePath + "/assets/" + modid + "/blockstates", blockstates.vertical_slab(modid, name)))
    listOfFiles.append(File(name+"_vertical_slab", basePath + "/assets/" + modid + "/models/item", modelItem.vertical_slab(modid, name)))
    listOfFiles.append(File(name+"_vertical_slab", basePath + "/assets/" + modid + "/models/block", modelBlock.vertical_slab(modid, name, vanilla)))

    # leaves_carpet, 
    name = item.name + "_leaves"
    listOfFiles.append(File(name+"_carpet", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.carpet(modid, name)))
    listOfFiles.append(File(name+"_carpet", basePath + "/assets/" + modid + "/blockstates", blockstates.carpet(modid, name)))
    listOfFiles.append(File(name+"_carpet", basePath + "/assets/" + modid + "/models/item", modelItem.carpet(modid, name)))
    listOfFiles.append(File(name+"_carpet", basePath + "/assets/" + modid + "/models/block", modelBlock.carpet(modid, item.name, vanilla)))

  elif item.structure_type == 'stone':
    vanilla = item.vanilla
    print("Hey Dummy, we haven't coded ln #186 yet")
    print("TODO: isStone=True")    
    # if this is a stone variant then create all the variant blocks, textures and associated files
    # block, polished_block, chiseled_block, bricks, cracked
    # with stairs, slabs, walls, buttons, vertical slabs
    # pressure_plates, steps,

    listOfFiles.append(File(item.name, basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.block(modid, item.name)))
    listOfFiles.append(File(item.name, basePath + "/assets/" + modid + "/blockstates", blockstates.block(modid, item.name)))
    listOfFiles.append(File(item.name, basePath + "/assets/" + modid + "/models/block", modelBlock.block(modid, item.name)))
    listOfFiles.append(File(item.name, basePath + "/assets/" + modid + "/models/item", modelItem.block(modid, item.name)))

    # stairs needs a switcher for the models
    listOfFiles.append(File(item.name+"_stairs", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.stairs(modid, item.name)))
    listOfFiles.append(File(item.name+"_stairs", basePath + "/assets/" + modid + "/blockstates", blockstates.stairs(modid, item.name)))
    listOfFiles.append(File(item.name+"_stairs", basePath + "/assets/" + modid + "/models/item", modelItem.stairs(modid, item.name)))
    arr = modelBlock.stairs(modid, item.name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_stairs"+switcher_stairs.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # slab needs a switcher for the models
    listOfFiles.append(File(item.name+"_slab", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.slab(modid, item.name)))
    listOfFiles.append(File(item.name+"_slab", basePath + "/assets/" + modid + "/blockstates", blockstates.slab(modid, item.name)))
    listOfFiles.append(File(item.name+"_slab", basePath + "/assets/" + modid + "/models/item", modelItem.slab(modid, item.name)))
    arr = modelBlock.slab(modid, item.name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_slab"+switcher_slab.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # wall returns an array from modelBlock
    listOfFiles.append(File(item.name+"_wall", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.wall(modid, item.name)))
    listOfFiles.append(File(item.name+"_wall", basePath + "/assets/" + modid + "/blockstates", blockstates.wall(modid, item.name)))
    listOfFiles.append(File(item.name+"_wall", basePath + "/assets/" + modid + "/models/item", modelItem.wall(modid, item.name)))    
    arr = modelBlock.wall(modid, item.name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_wall"+switcher_wall.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # button returns an array from modelBlock
    listOfFiles.append(File(item.name+"_button", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.button(modid, item.name)))
    listOfFiles.append(File(item.name+"_button", basePath + "/assets/" + modid + "/blockstates", blockstates.button(modid, item.name)))
    listOfFiles.append(File(item.name+"_button", basePath + "/assets/" + modid + "/models/item", modelItem.button(modid, item.name)))    
    arr = modelBlock.button(modid, item.name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_button"+switcher_button.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # vertical slab returns a single object from modelBlock
    listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.vertical_slab(modid, item.name)))
    listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/assets/" + modid + "/blockstates", blockstates.vertical_slab(modid, item.name)))
    listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/assets/" + modid + "/models/item", modelItem.vertical_slab(modid, item.name)))
    listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/assets/" + modid + "/models/block", modelBlock.vertical_slab(modid, item.name, vanilla)))

    # pressure plate returns an array from modelBlock
    listOfFiles.append(File(item.name+"_pressure_plate", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.pressure_plate(modid, item.name)))
    listOfFiles.append(File(item.name+"_pressure_plate", basePath + "/assets/" + modid + "/blockstates", blockstates.pressure_plate(modid, item.name)))
    listOfFiles.append(File(item.name+"_pressure_plate", basePath + "/assets/" + modid + "/models/item", modelItem.pressure_plate(modid, item.name)))    
    arr = modelBlock.pressure_plate(modid, item.name)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_pressure_plate"+switcher_pressure_plate.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

    # step returns an array from modelBlock
    listOfFiles.append(File(item.name+"_step", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.step(modid, item.name)))
    listOfFiles.append(File(item.name+"_step", basePath + "/assets/" + modid + "/blockstates", blockstates.step(modid, item.name)))
    listOfFiles.append(File(item.name+"_step", basePath + "/assets/" + modid + "/models/item", modelItem.step(modid, item.name)))    
    arr = modelBlock.step(modid, item.name, vanilla)
    for modelBlockItem in arr:
      listOfFiles.append( File(
        item.name+"_step"+switcher_step.get(modelBlockItem.get('parent'), "broken"), 
        basePath + "/assets/" + modid + "/models/block", 
        modelBlockItem))

  if item.shapes != None:    
    vanilla = item.vanilla
    for shapeName in item.shapes:
      print(shapeName)
      if shapeName == "block":        
        listOfFiles.append(File(item.name, basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.block(modid, item.name)))
        listOfFiles.append(File(item.name, basePath + "/assets/" + modid + "/blockstates", blockstates.block(modid, item.name)))
        listOfFiles.append(File(item.name, basePath + "/assets/" + modid + "/models/block", modelBlock.block(modid, item.name)))
        listOfFiles.append(File(item.name, basePath + "/assets/" + modid + "/models/item", modelItem.block(modid, item.name)))
      elif shapeName == "stairs":
        # stairs needs a switcher for the models
        listOfFiles.append(File(item.name+"_stairs", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.stairs(modid, item.name)))
        listOfFiles.append(File(item.name+"_stairs", basePath + "/assets/" + modid + "/blockstates", blockstates.stairs(modid, item.name)))
        listOfFiles.append(File(item.name+"_stairs", basePath + "/assets/" + modid + "/models/item", modelItem.stairs(modid, item.name)))
        arr = modelBlock.stairs(modid, item.name, vanilla)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_stairs"+switcher_stairs.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "slab":
        # slab needs a switcher for the models
        listOfFiles.append(File(item.name+"_slab", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.slab(modid, item.name)))
        listOfFiles.append(File(item.name+"_slab", basePath + "/assets/" + modid + "/blockstates", blockstates.slab(modid, item.name, item.vanilla)))
        listOfFiles.append(File(item.name+"_slab", basePath + "/assets/" + modid + "/models/item", modelItem.slab(modid, item.name)))
        arr = modelBlock.slab(modid, item.name, vanilla)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_slab"+switcher_slab.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "step":
        # step returns an array from modelBlock
        listOfFiles.append(File(item.name+"_step", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.step(modid, item.name)))
        listOfFiles.append(File(item.name+"_step", basePath + "/assets/" + modid + "/blockstates", blockstates.step(modid, item.name)))
        listOfFiles.append(File(item.name+"_step", basePath + "/assets/" + modid + "/models/item", modelItem.step(modid, item.name)))    
        arr = modelBlock.step(modid, item.name, vanilla)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_step"+switcher_step.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "vertical_slab":
        # vertical slab returns a single object from modelBlock
        listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.vertical_slab(modid, item.name)))
        listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/assets/" + modid + "/blockstates", blockstates.vertical_slab(modid, item.name)))
        listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/assets/" + modid + "/models/item", modelItem.vertical_slab(modid, item.name)))
        listOfFiles.append(File(item.name+"_vertical_slab", basePath + "/assets/" + modid + "/models/block", modelBlock.vertical_slab(modid, item.name, vanilla)))
      elif shapeName == "button":
        # button returns an array from modelBlock
        listOfFiles.append(File(item.name+"_button", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.button(modid, item.name)))
        listOfFiles.append(File(item.name+"_button", basePath + "/assets/" + modid + "/blockstates", blockstates.button(modid, item.name)))
        listOfFiles.append(File(item.name+"_button", basePath + "/assets/" + modid + "/models/item", modelItem.button(modid, item.name)))    
        arr = modelBlock.button(modid, item.name, vanilla)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_button"+switcher_button.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "fence":
        # fence returns an array from modelBlock
        listOfFiles.append(File(item.name+"_fence", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.fence(modid, item.name)))
        listOfFiles.append(File(item.name+"_fence", basePath + "/assets/" + modid + "/blockstates", blockstates.fence(modid, item.name)))
        listOfFiles.append(File(item.name+"_fence", basePath + "/assets/" + modid + "/models/item", modelItem.fence(modid, item.name)))    
        arr = modelBlock.fence(modid, item.name)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_fence"+switcher_fence.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "pressure_plate":
        # pressure plate returns an array from modelBlock
        listOfFiles.append(File(item.name+"_pressure_plate", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.pressure_plate(modid, item.name)))
        listOfFiles.append(File(item.name+"_pressure_plate", basePath + "/assets/" + modid + "/blockstates", blockstates.pressure_plate(modid, item.name)))
        listOfFiles.append(File(item.name+"_pressure_plate", basePath + "/assets/" + modid + "/models/item", modelItem.pressure_plate(modid, item.name)))    
        arr = modelBlock.pressure_plate(modid, item.name)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_pressure_plate"+switcher_pressure_plate.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "wall":
        # wall returns an array from modelBlock
        listOfFiles.append(File(item.name+"_wall", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.wall(modid, item.name)))
        listOfFiles.append(File(item.name+"_wall", basePath + "/assets/" + modid + "/blockstates", blockstates.wall(modid, item.name)))
        listOfFiles.append(File(item.name+"_wall", basePath + "/assets/" + modid + "/models/item", modelItem.wall(modid, item.name)))    
        arr = modelBlock.wall(modid, item.name, vanilla)
        for modelBlockItem in arr:
          listOfFiles.append( File(
            item.name+"_wall"+switcher_wall.get(modelBlockItem.get('parent'), "broken"), 
            basePath + "/assets/" + modid + "/models/block", 
            modelBlockItem))
      elif shapeName == "carpet":
        # leaves_carpet, 
        name = item.name + "_leaves"
        listOfFiles.append(File(name+"_carpet", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.carpet(modid, name)))
        listOfFiles.append(File(name+"_carpet", basePath + "/assets/" + modid + "/blockstates", blockstates.carpet(modid, name)))
        listOfFiles.append(File(name+"_carpet", basePath + "/assets/" + modid + "/models/item", modelItem.carpet(modid, name)))
        listOfFiles.append(File(name+"_carpet", basePath + "/assets/" + modid + "/models/block", modelBlock.carpet(modid, item.name, vanilla)))
      elif shapeName == "log":        
        # Log - just a single return from modelBlock
        listOfFiles.append(File(item.name+"_log", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.log(modid, item.name)))
        listOfFiles.append(File(item.name+"_log", basePath + "/assets/" + modid + "/blockstates", blockstates.log(modid, item.name)))
        listOfFiles.append(File(item.name+"_log", basePath + "/assets/" + modid + "/models/block", modelBlock.log(modid, item.name)))
        listOfFiles.append(File(item.name+"_log", basePath + "/assets/" + modid + "/models/item", modelItem.log(modid, item.name)))
      elif shapeName == "leaves":
        # Leaves - just a single return from modelBlock
        listOfFiles.append(File(item.name+"_leaves", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.leaves(modid, item.name)))
        listOfFiles.append(File(item.name+"_leaves", basePath + "/assets/" + modid + "/blockstates", blockstates.leaves(modid, item.name)))
        listOfFiles.append(File(item.name+"_leaves", basePath + "/assets/" + modid + "/models/item", modelItem.leaves(modid, item.name)))
        listOfFiles.append(File(item.name+"_leaves", basePath + "/assets/" + modid + "/models/block", modelBlock.leaves(modid, item.name)))
      elif shapeName == "sapling":
        # Sapling - just a single return from modelBlock
        listOfFiles.append(File(item.name+"_sapling", basePath + "/data/" + modid + "/loot_tables/blocks",loot_tables.sapling(modid, item.name)))
        listOfFiles.append(File(item.name+"_sapling", basePath + "/assets/" + modid + "/blockstates", blockstates.sapling(modid, item.name)))
        listOfFiles.append(File(item.name+"_sapling", basePath + "/assets/" + modid + "/models/block", modelBlock.sapling(modid, item.name)))
        listOfFiles.append(File(item.name+"_sapling", basePath + "/assets/" + modid + "/models/item", modelItem.sapling(modid, item.name)))

for file in listOfFiles:
  #print(file.name)
  #print(file.path)
  #print(file.data)
  writeToJSONFile(file.path,file.name,file.data)
  print(json.dumps(file.data, indent=2, sort_keys=True))


    # strippedLog,







# path = basePath + '/data/" + modid + "/loot_tables/blocks'
# data = lootTable
# writeToJSONFile(path,fileName,data)
# print(json.dumps(data, indent=2, sort_keys=True))

# path = basePath + '/assets/" + modid + "/blockstates'
# data = blockstate
# writeToJSONFile(path,fileName,data)
# print(json.dumps(data, indent=2, sort_keys=True))

# path = basePath + '/assets/" + modid + "/models/block'
# data = modelBlock
# writeToJSONFile(path,fileName,data)
# print(json.dumps(data, indent=2, sort_keys=True))

# path = basePath + '/assets/" + modid + "/models/item'
# data = modelItem
# writeToJSONFile(path,fileName,data)
# print(json.dumps(data, indent=2, sort_keys=True))



# for file in listOfFiles:
  # print(file.name)
  # print(file.path)
  # print(json.dumps(file.data, indent=2, sort_keys=True))




