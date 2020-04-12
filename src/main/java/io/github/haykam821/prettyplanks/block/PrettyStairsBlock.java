package io.github.haykam821.prettyplanks.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class PrettyStairsBlock extends StairsBlock {
	public PrettyStairsBlock(Block base) {
		super(base.getDefaultState(), FabricBlockSettings.copy(base).build());
	}
}