package io.github.andyjay24.bingus_mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LToolMaterial implements ToolMaterial {

	public static final LToolMaterial INSTANCE = new LToolMaterial();

	@Override
	public int getDurability() {
		return 350;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 4.5F;
	}

	@Override
	public float getAttackDamage() {
		return 2.0F;
	}

	@Override
	public int getMiningLevel() {
		return 2;
	}

	@Override
	public int getEnchantability() {
		return 15;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.IRON_INGOT);
	}
}
