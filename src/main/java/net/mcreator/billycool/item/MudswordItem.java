
package net.mcreator.billycool.item;

@Billycool1ModElements.ModElement.Tag
public class MudswordItem extends Billycool1ModElements.ModElement {

	@ObjectHolder("billycool1:mudsword")
	public static final Item block = null;

	public MudswordItem(Billycool1ModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 20;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIRT, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("epee en bois"));
			}

		}.setRegistryName("mudsword"));
	}

}
