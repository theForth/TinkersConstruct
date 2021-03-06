package mods.tinker.tconstruct.landmine.logic.behavior;

import mods.tinker.tconstruct.landmine.damageSource.DamageSourceLandmine;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BehaviorDefault extends Behavior{

	@Override
	public void executeLogic(World par1World, int par2, int par3, int par4, ItemStack par5ItemStack, Entity triggerer, boolean willBlockBeRemoved) {
		if(triggerer != null){
			triggerer.attackEntityFrom(new DamageSourceLandmine("Landmine"), (int) 5F);
		}
	}

}
