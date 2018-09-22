package com.revature.dto;

public class Defense {
	private int tackles;
	private int assists;
	private int combined;
	private int sacks;
	private int sack_yards;
	private int interceptions;
	private int passes_defended;
	private int forced_fumbles;
	private int fumble_recoveries;
	private int qb_hits;
	private int tloss;
	private int tloss_yards;
	private int safeties;
	private int sp_tackles;
	private int sp_assists;
	private int sp_forced_fumbles;
	private int sp_fumble_recoveries;
	private int sp_blocks;
	private int misc_tackles;
	private int misc_assists;
	private int misc_forced_fumbles;
	private int misc_fumble_recoveries;
	private int def_targets;
	private int def_comps;
	private int blitzes;
	private int hurries;
	private int knockdowns;
	private int missed_tackles;
	public Defense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Defense(int tackles, int assists, int combined, int sacks, int sack_yards, int interceptions,
			int passes_defended, int forced_fumbles, int fumble_recoveries, int qb_hits, int tloss, int tloss_yards,
			int safeties, int sp_tackles, int sp_assists, int sp_forced_fumbles, int sp_fumble_recoveries,
			int sp_blocks, int misc_tackles, int misc_assists, int misc_forced_fumbles, int misc_fumble_recoveries,
			int def_targets, int def_comps, int blitzes, int hurries, int knockdowns, int missed_tackles) {
		super();
		this.tackles = tackles;
		this.assists = assists;
		this.combined = combined;
		this.sacks = sacks;
		this.sack_yards = sack_yards;
		this.interceptions = interceptions;
		this.passes_defended = passes_defended;
		this.forced_fumbles = forced_fumbles;
		this.fumble_recoveries = fumble_recoveries;
		this.qb_hits = qb_hits;
		this.tloss = tloss;
		this.tloss_yards = tloss_yards;
		this.safeties = safeties;
		this.sp_tackles = sp_tackles;
		this.sp_assists = sp_assists;
		this.sp_forced_fumbles = sp_forced_fumbles;
		this.sp_fumble_recoveries = sp_fumble_recoveries;
		this.sp_blocks = sp_blocks;
		this.misc_tackles = misc_tackles;
		this.misc_assists = misc_assists;
		this.misc_forced_fumbles = misc_forced_fumbles;
		this.misc_fumble_recoveries = misc_fumble_recoveries;
		this.def_targets = def_targets;
		this.def_comps = def_comps;
		this.blitzes = blitzes;
		this.hurries = hurries;
		this.knockdowns = knockdowns;
		this.missed_tackles = missed_tackles;
	}
	public int getTackles() {
		return tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getCombined() {
		return combined;
	}
	public void setCombined(int combined) {
		this.combined = combined;
	}
	public int getSacks() {
		return sacks;
	}
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	public int getSack_yards() {
		return sack_yards;
	}
	public void setSack_yards(int sack_yards) {
		this.sack_yards = sack_yards;
	}
	public int getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	public int getPasses_defended() {
		return passes_defended;
	}
	public void setPasses_defended(int passes_defended) {
		this.passes_defended = passes_defended;
	}
	public int getForced_fumbles() {
		return forced_fumbles;
	}
	public void setForced_fumbles(int forced_fumbles) {
		this.forced_fumbles = forced_fumbles;
	}
	public int getFumble_recoveries() {
		return fumble_recoveries;
	}
	public void setFumble_recoveries(int fumble_recoveries) {
		this.fumble_recoveries = fumble_recoveries;
	}
	public int getQb_hits() {
		return qb_hits;
	}
	public void setQb_hits(int qb_hits) {
		this.qb_hits = qb_hits;
	}
	public int getTloss() {
		return tloss;
	}
	public void setTloss(int tloss) {
		this.tloss = tloss;
	}
	public int getTloss_yards() {
		return tloss_yards;
	}
	public void setTloss_yards(int tloss_yards) {
		this.tloss_yards = tloss_yards;
	}
	public int getSafeties() {
		return safeties;
	}
	public void setSafeties(int safeties) {
		this.safeties = safeties;
	}
	public int getSp_tackles() {
		return sp_tackles;
	}
	public void setSp_tackles(int sp_tackles) {
		this.sp_tackles = sp_tackles;
	}
	public int getSp_assists() {
		return sp_assists;
	}
	public void setSp_assists(int sp_assists) {
		this.sp_assists = sp_assists;
	}
	public int getSp_forced_fumbles() {
		return sp_forced_fumbles;
	}
	public void setSp_forced_fumbles(int sp_forced_fumbles) {
		this.sp_forced_fumbles = sp_forced_fumbles;
	}
	public int getSp_fumble_recoveries() {
		return sp_fumble_recoveries;
	}
	public void setSp_fumble_recoveries(int sp_fumble_recoveries) {
		this.sp_fumble_recoveries = sp_fumble_recoveries;
	}
	public int getSp_blocks() {
		return sp_blocks;
	}
	public void setSp_blocks(int sp_blocks) {
		this.sp_blocks = sp_blocks;
	}
	public int getMisc_tackles() {
		return misc_tackles;
	}
	public void setMisc_tackles(int misc_tackles) {
		this.misc_tackles = misc_tackles;
	}
	public int getMisc_assists() {
		return misc_assists;
	}
	public void setMisc_assists(int misc_assists) {
		this.misc_assists = misc_assists;
	}
	public int getMisc_forced_fumbles() {
		return misc_forced_fumbles;
	}
	public void setMisc_forced_fumbles(int misc_forced_fumbles) {
		this.misc_forced_fumbles = misc_forced_fumbles;
	}
	public int getMisc_fumble_recoveries() {
		return misc_fumble_recoveries;
	}
	public void setMisc_fumble_recoveries(int misc_fumble_recoveries) {
		this.misc_fumble_recoveries = misc_fumble_recoveries;
	}
	public int getDef_targets() {
		return def_targets;
	}
	public void setDef_targets(int def_targets) {
		this.def_targets = def_targets;
	}
	public int getDef_comps() {
		return def_comps;
	}
	public void setDef_comps(int def_comps) {
		this.def_comps = def_comps;
	}
	public int getBlitzes() {
		return blitzes;
	}
	public void setBlitzes(int blitzes) {
		this.blitzes = blitzes;
	}
	public int getHurries() {
		return hurries;
	}
	public void setHurries(int hurries) {
		this.hurries = hurries;
	}
	public int getKnockdowns() {
		return knockdowns;
	}
	public void setKnockdowns(int knockdowns) {
		this.knockdowns = knockdowns;
	}
	public int getMissed_tackles() {
		return missed_tackles;
	}
	public void setMissed_tackles(int missed_tackles) {
		this.missed_tackles = missed_tackles;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assists;
		result = prime * result + blitzes;
		result = prime * result + combined;
		result = prime * result + def_comps;
		result = prime * result + def_targets;
		result = prime * result + forced_fumbles;
		result = prime * result + fumble_recoveries;
		result = prime * result + hurries;
		result = prime * result + interceptions;
		result = prime * result + knockdowns;
		result = prime * result + misc_assists;
		result = prime * result + misc_forced_fumbles;
		result = prime * result + misc_fumble_recoveries;
		result = prime * result + misc_tackles;
		result = prime * result + missed_tackles;
		result = prime * result + passes_defended;
		result = prime * result + qb_hits;
		result = prime * result + sack_yards;
		result = prime * result + sacks;
		result = prime * result + safeties;
		result = prime * result + sp_assists;
		result = prime * result + sp_blocks;
		result = prime * result + sp_forced_fumbles;
		result = prime * result + sp_fumble_recoveries;
		result = prime * result + sp_tackles;
		result = prime * result + tackles;
		result = prime * result + tloss;
		result = prime * result + tloss_yards;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Defense other = (Defense) obj;
		if (assists != other.assists)
			return false;
		if (blitzes != other.blitzes)
			return false;
		if (combined != other.combined)
			return false;
		if (def_comps != other.def_comps)
			return false;
		if (def_targets != other.def_targets)
			return false;
		if (forced_fumbles != other.forced_fumbles)
			return false;
		if (fumble_recoveries != other.fumble_recoveries)
			return false;
		if (hurries != other.hurries)
			return false;
		if (interceptions != other.interceptions)
			return false;
		if (knockdowns != other.knockdowns)
			return false;
		if (misc_assists != other.misc_assists)
			return false;
		if (misc_forced_fumbles != other.misc_forced_fumbles)
			return false;
		if (misc_fumble_recoveries != other.misc_fumble_recoveries)
			return false;
		if (misc_tackles != other.misc_tackles)
			return false;
		if (missed_tackles != other.missed_tackles)
			return false;
		if (passes_defended != other.passes_defended)
			return false;
		if (qb_hits != other.qb_hits)
			return false;
		if (sack_yards != other.sack_yards)
			return false;
		if (sacks != other.sacks)
			return false;
		if (safeties != other.safeties)
			return false;
		if (sp_assists != other.sp_assists)
			return false;
		if (sp_blocks != other.sp_blocks)
			return false;
		if (sp_forced_fumbles != other.sp_forced_fumbles)
			return false;
		if (sp_fumble_recoveries != other.sp_fumble_recoveries)
			return false;
		if (sp_tackles != other.sp_tackles)
			return false;
		if (tackles != other.tackles)
			return false;
		if (tloss != other.tloss)
			return false;
		if (tloss_yards != other.tloss_yards)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Defense [tackles=" + tackles + ", assists=" + assists + ", combined=" + combined + ", sacks=" + sacks
				+ ", sack_yards=" + sack_yards + ", interceptions=" + interceptions + ", passes_defended="
				+ passes_defended + ", forced_fumbles=" + forced_fumbles + ", fumble_recoveries=" + fumble_recoveries
				+ ", qb_hits=" + qb_hits + ", tloss=" + tloss + ", tloss_yards=" + tloss_yards + ", safeties="
				+ safeties + ", sp_tackles=" + sp_tackles + ", sp_assists=" + sp_assists + ", sp_forced_fumbles="
				+ sp_forced_fumbles + ", sp_fumble_recoveries=" + sp_fumble_recoveries + ", sp_blocks=" + sp_blocks
				+ ", misc_tackles=" + misc_tackles + ", misc_assists=" + misc_assists + ", misc_forced_fumbles="
				+ misc_forced_fumbles + ", misc_fumble_recoveries=" + misc_fumble_recoveries + ", def_targets="
				+ def_targets + ", def_comps=" + def_comps + ", blitzes=" + blitzes + ", hurries=" + hurries
				+ ", knockdowns=" + knockdowns + ", missed_tackles=" + missed_tackles + "]";
	}
}
