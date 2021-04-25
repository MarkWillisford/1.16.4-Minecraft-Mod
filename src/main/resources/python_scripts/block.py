def blockstate(mod_id, name):
  return {
    'variants': {
      '':{ 'model': mod_id + ':block/' + name }
    }
  }

def loot_tables(mod_id, name):
  return {
    'type': 'minecraft:block',
    'pools': [
      {
        'rolls': 1.0,
        'entries': [
          {
            'type': 'minecraft:item',
            'name': mod_id + ':' + name
          }
        ]
      }
    ]
  }

def model_block(mod_id, name):
  return [{
    'parent': 'block/cube_all',
    'textures': {
      'all': mod_id + ':blocks/' + name
    }
  }]

def model_item(mod_id, name):
  return {
    'parent': mod_id + ':block/' + name
  }