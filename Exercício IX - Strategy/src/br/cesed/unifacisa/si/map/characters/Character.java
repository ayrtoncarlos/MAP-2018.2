package br.cesed.unifacisa.si.map.characters;

import br.cesed.unifacisa.si.map.weapons.AxeBehavior;
import br.cesed.unifacisa.si.map.weapons.BowAndArrowBehavior;
import br.cesed.unifacisa.si.map.weapons.KnifeBehavior;
import br.cesed.unifacisa.si.map.weapons.SwordBehavior;
import br.cesed.unifacisa.si.map.weapons.WeaponBehavior;

public enum Character implements WeaponBehavior
{
	KING 
	{
		SwordBehavior sb;

		@Override
		public String useWeapon() 
		{
			return sb.useWeapon();
		}
	},

	KNIGHT 
	{
		KnifeBehavior kb;

		@Override
		public String useWeapon() 
		{
			return kb.useWeapon();
		}
	},

	QUEEN 
	{
		BowAndArrowBehavior bab;

		@Override
		public String useWeapon() 
		{
			return bab.useWeapon();
		}
	},

	TROLL 
	{
		AxeBehavior ab;

		@Override
		public String useWeapon() 
		{
			return ab.useWeapon();
		}
	};
}
