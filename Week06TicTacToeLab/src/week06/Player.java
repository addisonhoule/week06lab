package week06;

public class Player {
	private String player;
	private String xOrO;
	

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public void describe() {
		System.out.print(player.toString());
	}
	public String getxOrO() {
		return xOrO;
	}
	public void setxOrO(Player player, String xOrO) {
		this.xOrO = xOrO;
	}

	//Set X or O
}
