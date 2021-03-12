package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		Random ran = new Random ();
		int ranRow = ran.nextInt(10);
		int ranCol = ran.nextInt (10);
		World world = new World ();
		Bug bug = new Bug ();
		Bug bugger = new Bug ();
		Location location = new Location (3, 4);
		Location ranLoc = new Location (ranRow, ranCol);
		if (ranCol < 10) {
		Location locFl = new Location (ranRow, ranCol + 1);
		world.add(locFl, new Flower ());
		}
		if (ranCol > 0) {
		Location locFlo = new Location (ranRow, ranCol -1);
		world.add(locFlo, new Flower ());
		}
		world.show();
		world.add(location, bug);
		world.add(ranLoc, bugger);
		bugger.setColor(Color.blue);
		bugger.turn();
		bugger.turn();
		
	}
}
