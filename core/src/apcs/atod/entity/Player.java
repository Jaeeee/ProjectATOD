package apcs.atod.entity;

import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.math.Vector3;

public class Player extends Entity 
{
	static Model model = EntityUtils.loadModel("core/assets/fighterplane/fighterplane.g3db");
	private double speed;
	private double damage;
	private double hp;
	private static double rof;
	private double score;
	private long time = System.nanoTime();
	
/*
	public Player(double s, double d, double rateoffire, Vector3 initPos) 
	{
		rof = rateoffire;
		speed = s;
		damage = d;
		hp = 10.0;
		pos = initPos;
		score = 0;
	}
*/
	public static double getrof()
	{
		return rof;
	}
	public void setup() 
	{
		// TODO Auto-generated method stub
		modelInstance = new ModelInstance(model, 0f,0f,0f);
	}

	public void update() 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void dispose()
	{
		model.dispose();
	}
	
	public double getHealth()
	{
		return hp;
	}
	
	public void removeHealth()
	{
		hp -= 1;
	}
	
	public void addToScore()
	{
		score++;
	}
	
	public double getScore()
	{
		return score;
	}
	public boolean canfire()
	{
		if(System.nanoTime() + rof == time)
		{
			time = System.nanoTime();
			return true;
		}
		else 
			return false;
	}
}
