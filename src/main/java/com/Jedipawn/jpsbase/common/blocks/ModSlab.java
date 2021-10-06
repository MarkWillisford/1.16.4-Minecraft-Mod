package com.Jedipawn.jpsbase.common.blocks;

import javax.annotation.Nullable;
import javax.swing.text.html.BlockView;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;



public class ModSlab extends SlabBlock {
    public static final Logger LOGGER = LogManager.getLogger();
	public ModSlab(Properties properties) {
		super(properties);
		this.setDefaultState(this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.valueOf(false)));
	}
	public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
	      return true;
	}
	public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
	   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	   protected static final VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
	   protected static final VoxelShape TOP_SHAPE = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);

	   @Nullable
	   public BlockState getStateForPlacement(BlockItemUseContext context) {
		   LOGGER.info("********************************************************************************************");
		   LOGGER.info("********************************************************************************************");
		   LOGGER.info("********************************************************************************************");
		   LOGGER.info("getStateForPlacement");
		   
		   BlockPos blockpos = context.getPos();
	      BlockState blockstate = context.getWorld().getBlockState(blockpos);
	      if (blockstate.isIn(this)) {
	    	  LOGGER.info("Blah blah blah in IF");
	         return blockstate.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, Boolean.valueOf(false));
	      } else {
	         FluidState fluidstate = context.getWorld().getFluidState(blockpos);
	         BlockState blockstate1 = this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.valueOf(fluidstate.getFluid() == Fluids.WATER));
	         Direction direction = context.getFace();
	         return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, SlabType.TOP);
	      }
	   }
	   public boolean isTransparent(BlockState state) {
		      return true;
		   }
	   
	   public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
//		   LOGGER.info("********************************************************************************************");
//		   LOGGER.info("********************************************************************************************");
//		   LOGGER.info("********************************************************************************************");
//		   LOGGER.info("isReplaceable");
		   ItemStack itemstack = useContext.getItem();
	      SlabType slabtype = state.get(TYPE);
	      if (slabtype != SlabType.DOUBLE && itemstack.getItem() == this.asItem()) {
	         if (useContext.replacingClickedOnBlock()) {
	            boolean flag = useContext.getHitVec().y - (double)useContext.getPos().getY() > 0.5D;
	            Direction direction = useContext.getFace();
	            if (slabtype == SlabType.BOTTOM) {
	               return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
	            } else {
	               return direction == Direction.DOWN || !flag && direction.getAxis().isHorizontal();
	            }
	         } else {
	            return true;
	         }
	      } else {
	         return false;
	      }
	   }

	   
	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
//		   LOGGER.info("********************************************************************************************");
//		   LOGGER.info("********************************************************************************************");
//		   LOGGER.info("********************************************************************************************");
//		   LOGGER.info("updatePostPlacement");
		   if (stateIn.get(WATERLOGGED)) {
	         worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
	      }

	      return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }
		
	   public float getAmbientOcclusionLightLevel(BlockState blockState_1,
			BlockView blockView_1, BlockPos blockPos_1)
		{
			return 1.0F;
		}
		
		
	   public boolean isTranslucent(BlockState blockState_1, BlockView blockView_1,
			BlockPos blockPos_1)
		{
			return true;
		}
		
		public boolean isSimpleFullBlock(BlockState blockState_1,
			BlockView blockView_1, BlockPos blockPos_1)
		{
			return false;
		}
}
