def stairs(modid, name, vanilla):
  if vanilla == True:
    return {
        "type":"minecraft:crafting_shaped",
        "pattern":[
          "I  ",
          "II ",
          "III"
        ],
        "key":{
          "I":{
            "item": "minecraft:" + name
          }
        },
        "result":{
          "item": modid + ":" + name + "_stairs",
          "count":4
        }
      }
  else:
    return {
        "type":"minecraft:crafting_shaped",
        "pattern":[
          "I  ",
          "II ",
          "III"
        ],
        "key":{
          "I":{
            "item": modid + ":" + name
          }
        },
        "result":{
          "item": modid + ":" + name + "_stairs",
          "count":4
        }
      }

def slab(modid, name, vanilla):
  if vanilla == True:
    return {
      "type":"minecraft:crafting_shaped",
      "pattern":[
        "III"
      ],
      "key":{
        "I":{
          "item": "minecraft:" + name
        }
      },
      "result":{
        "item": modid + ":" + name + "_slab",
        "count":6
      }
    }
  else:
    return {
      "type":"minecraft:crafting_shaped",
      "pattern":[
        "III"
      ],
      "key":{
        "I":{
          "item": modid + ":" + name
        }
      },
      "result":{
        "item": modid + ":" + name + "_slab",
        "count":6
      }
    }
