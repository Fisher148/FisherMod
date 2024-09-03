package com.fisher.fishermod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelWanderer extends ModelBase {
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer top;
	private final ModelRenderer top_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer headwear;
	private final ModelRenderer headwear_r1;

	public ModelWanderer() {
		textureWidth = 128;
		textureHeight = 128;

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 20.4537F, -3.8156F);
		

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(-2.0F, 3.4676F, 3.9052F);
		right_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 0.0F, 3.1416F, 0.0F);
		right_leg_r1.cubeList.add(new ModelBox(right_leg_r1, 0, 3, -3.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, false));
		right_leg_r1.cubeList.add(new ModelBox(right_leg_r1, 18, 48, -4.0F, -12.0F, -2.0F, 4, 8, 4, 0.0F, false));
		right_leg_r1.cubeList.add(new ModelBox(right_leg_r1, 54, 16, -4.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 20.2694F, 3.0621F);
		

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(2.0F, 3.684F, -2.9289F);
		left_leg.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 0.0F, 3.1416F, 0.0F);
		left_leg_r1.cubeList.add(new ModelBox(left_leg_r1, 0, 0, 1.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, false));
		left_leg_r1.cubeList.add(new ModelBox(left_leg_r1, 0, 50, 0.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F, false));
		left_leg_r1.cubeList.add(new ModelBox(left_leg_r1, 48, 26, 0.0F, -12.0F, -2.0F, 4, 8, 4, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 3.1416F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 48, 10, -3.0F, -17.0F, -2.0F, 6, 3, 3, 0.0F, false));
		body_r1.cubeList.add(new ModelBox(body_r1, 24, 26, -4.0F, -14.0F, -2.0F, 8, 2, 4, 0.0F, false));
		body_r1.cubeList.add(new ModelBox(body_r1, 48, 0, -4.0F, -24.0F, -2.0F, 8, 7, 3, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_arm.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 0.0F, 3.1416F, 0.0F);
		left_arm_r1.cubeList.add(new ModelBox(left_arm_r1, 34, 48, 4.0F, -24.0F, -2.0F, 3, 12, 3, 0.0F, false));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 3.1416F, 0.0F);
		right_arm_r1.cubeList.add(new ModelBox(right_arm_r1, 46, 48, -7.0F, -24.0F, -2.0F, 3, 12, 3, 0.0F, false));

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		top_r1 = new ModelRenderer(this);
		top_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		top.addChild(top_r1);
		setRotationAngle(top_r1, 0.0F, 3.1416F, 0.0F);
		top_r1.cubeList.add(new ModelBox(top_r1, 0, 40, -7.0F, -26.0F, -4.0F, 3, 2, 8, 0.0F, false));
		top_r1.cubeList.add(new ModelBox(top_r1, 40, 16, 4.0F, -26.0F, -4.0F, 3, 2, 8, 0.0F, false));
		top_r1.cubeList.add(new ModelBox(top_r1, 0, 0, -8.0F, -24.0F, -4.0F, 16, 16, 8, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 3.1416F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 24, 32, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.0F, false));

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		headwear_r1 = new ModelRenderer(this);
		headwear_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		headwear.addChild(headwear_r1);
		setRotationAngle(headwear_r1, 0.0F, 3.1416F, 0.0F);
		headwear_r1.cubeList.add(new ModelBox(headwear_r1, 0, 24, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		right_leg.render(f5);
		left_leg.render(f5);
		body.render(f5);
		left_arm.render(f5);
		right_arm.render(f5);
		top.render(f5);
		head.render(f5);
		headwear.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		// Більша амплітуда для ніг
		this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
		this.right_leg_r1.rotateAngleX = this.right_leg.rotateAngleX;
		
		this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
		this.left_leg_r1.rotateAngleX = this.left_leg.rotateAngleX;
		
		// Нахил тулуба під час кроку
		this.body.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.1F * limbSwingAmount;
		this.body_r1.rotateAngleX = this.body.rotateAngleX;
		
		// Нахил правої руки разом з кроком
		this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.5F * limbSwingAmount * 0.5F + this.body.rotateAngleX;
		this.right_arm_r1.rotateAngleX = this.right_arm.rotateAngleX;
		
		// Нахил лівої руки разом з кроком
		this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.5F * limbSwingAmount * 0.5F + this.body.rotateAngleX;
		this.left_arm_r1.rotateAngleX = this.left_arm.rotateAngleX;
		
		// Фіксація голови (обмеження обертання тільки в горизонтальній площині)
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.headwear.rotateAngleY = this.head.rotateAngleY;
		
		// Не дозволяємо обертати голову вгору або вниз
		this.head.rotateAngleX = 0.0F;
		this.headwear.rotateAngleX = 0.0F;
	}
	
	
}