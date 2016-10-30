package com.lovo.bean;

public class Television {
	private int channel;// 频道

	private int volume;// 音量
		
	public Television() {
		super();
	}

	public Television(int channel, int volume) {
		super();
		this.setChannel(channel);
		this.setVolume(volume);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel < 2 && channel > 999) {
			System.out.println("频道的范围是2-999");
		} else {
			this.channel = channel;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume < 0 && volume >10){
			System.out.println("音量的范围是0-10");
		}else{
			this.volume = volume;
		}
		
	}

}
