def block(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name
          }
        ]
      }
    ]
  }

def stairs(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_stairs"
          }
        ]
      }
    ]
  }

def slab(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1,
        "entries": [
          {
            "type": "minecraft:item",
            "functions": [
              {
                "function": "minecraft:set_count",
                "conditions": [
                  {
                    "condition": "minecraft:block_state_property",
                    "block": modid + ":" + name + "_slab",
                    "properties": {
                      "type": "double"
                    }
                  }
                ],
                "count": 2
              },
              {
                "function": "minecraft:explosion_decay"
              }
            ],
            "name": modid + ":" + name + "_slab"
          }
        ]
      }
    ]
  }

def step(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_step"
          }
        ]
      }
    ]
  }

def vertical_slab(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_vertical_slab"
          }
        ]
      }
    ]
  }

def button(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_button"
          }
        ]
      }
    ]
  }

def fence(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_fence"
          }
        ]
      }
    ]
  }

def pressure_plate(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_pressure_plate"
          }
        ]
      }
    ]
  }

def sapling(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_sapling"
          }
        ]
      }
    ]
  }

def wall(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_wall"
          }
        ]
      }
    ]
  }

def leaves(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1,
        "entries": [
          {
            "type": "minecraft:alternatives",
            "children": [
              {
                "type": "minecraft:item",
                "conditions": [
                  {
                    "condition": "minecraft:alternative",
                    "terms": [
                      {
                        "condition": "minecraft:match_tool",
                        "predicate": {
                          "item": "minecraft:shears"
                        }
                      },
                      {
                        "condition": "minecraft:match_tool",
                        "predicate": {
                          "enchantments": [
                            {
                              "enchantment": "minecraft:silk_touch",
                              "levels": {
                                "min": 1
                              }
                            }
                          ]
                        }
                      }
                    ]
                  }
                ],
                "name": modid + ":" + name + "_leaves"
              },
              {
                "type": "minecraft:item",
                "conditions": [
                  {
                    "condition": "minecraft:survives_explosion"
                  },
                  {
                    "condition": "minecraft:table_bonus",
                    "enchantment": "minecraft:fortune",
                    "chances": [
                      0.05,
                      0.0625,
                      0.083333336,
                      0.1
                    ]
                  }
                ],
                "name": modid + ":" + name + "_sapling"
              }
            ]
          }
        ]
      },
      {
        "rolls": 1,
        "entries": [
          {
            "type": "minecraft:item",
            "conditions": [
              {
                "condition": "minecraft:table_bonus",
                "enchantment": "minecraft:fortune",
                "chances": [
                  0.02,
                  0.022222223,
                  0.025,
                  0.033333335,
                  0.1
                ]
              }
            ],
            "functions": [
              {
                "function": "minecraft:set_count",
                "count": {
                  "min": 1.0,
                  "max": 2.0,
                  "type": "minecraft:uniform"
                }
              },
              {
                "function": "minecraft:explosion_decay"
              }
            ],
            "name": "minecraft:stick"
          }
        ],
        "conditions": [
          {
            "condition": "minecraft:inverted",
            "term": {
              "condition": "minecraft:alternative",
              "terms": [
                {
                  "condition": "minecraft:match_tool",
                  "predicate": {
                    "item": "minecraft:shears"
                  }
                },
                {
                  "condition": "minecraft:match_tool",
                  "predicate": {
                    "enchantments": [
                      {
                        "enchantment": "minecraft:silk_touch",
                        "levels": {
                          "min": 1
                        }
                      }
                    ]
                  }
                }
              ]
            }
          }
        ]
      },
      {
        "rolls": 1,
        "entries": [
          {
            "type": "minecraft:item",
            "conditions": [
              {
                "condition": "minecraft:survives_explosion"
              },
              {
                "condition": "minecraft:table_bonus",
                "enchantment": "minecraft:fortune",
                "chances": [
                  0.005,
                  0.0055555557,
                  0.00625,
                  0.008333334,
                  0.025
                ]
              }
            ],
            "name": "minecraft:apple"
          }
        ],
        "conditions": [
          {
            "condition": "minecraft:inverted",
            "term": {
              "condition": "minecraft:alternative",
              "terms": [
                {
                  "condition": "minecraft:match_tool",
                  "predicate": {
                    "item": "minecraft:shears"
                  }
                },
                {
                  "condition": "minecraft:match_tool",
                  "predicate": {
                    "enchantments": [
                      {
                        "enchantment": "minecraft:silk_touch",
                        "levels": {
                          "min": 1
                        }
                      }
                    ]
                  }
                }
              ]
            }
          }
        ]
      }
    ]
  }

def log(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_log"
          }
        ]
      }
    ]
  }
  
def carpet(modid, name):
  return {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1.0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": modid + ":" + name + "_carpet"
          }
        ]
      }
    ]
  }
#def carpet