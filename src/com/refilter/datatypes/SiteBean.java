/*
 * REFilters: RNA Editing Filters
 *     Copyright (C) <2014>  <Xing Li>
 *
 *     RED is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     RED is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.refilter.datatypes;

/**
 * Created by Administrator on 2014/10/1.
 */
public class SiteBean {
    private String chr;
    private int pos;
    private String id;
    private char ref;
    private char alt;
    private float qual;
    private String filter;
    private String info;
    private String gt;
    private String ad;
    private String dp;
    private String gq;
    private String pl;
    private double level = -1;
    private double pvalue = -1;
    private double fdr = -1;


    private String isAlu;

    public SiteBean(String chr, int pos, String id, char ref, char alt, float qual, String filter, String info, String gt, String ad, String dp, String gq,
                    String pl, String isAlu) {
        this.chr = chr;
        this.pos = pos;
        this.id = id;
        this.ref = ref;
        this.alt = alt;
        this.qual = qual;
        this.filter = filter;
        this.info = info;
        this.gt = gt;
        this.ad = ad;
        this.dp = dp;
        this.gq = gq;
        this.pl = pl;
        this.isAlu = isAlu;
    }

    public SiteBean(String chr, int pos) {
        this.chr = chr;
        this.pos = pos;
    }

    public String getChr() {
        return chr;
    }

    public String getIsAlu() {
        return isAlu;
    }

    public void setIsAlu(String isAlu) {
        this.isAlu = isAlu;
    }

    public int getPos() {
        return pos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getRef() {
        return ref;
    }

    public void setRef(char ref) {
        this.ref = ref;
    }

    public char getAlt() {
        return alt;
    }

    public void setAlt(char alt) {
        this.alt = alt;
    }

    public float getQual() {
        return qual;
    }

    public void setQual(float qual) {
        this.qual = qual;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getGq() {
        return gq;
    }

    public void setGq(String gq) {
        this.gq = gq;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public double getPvalue() {
        return pvalue;
    }

    public void setPValue(double pvalue) {
        this.pvalue = pvalue;
    }

    public double getFdr() {
        return fdr;
    }

    public void setFdr(double fdr) {
        this.fdr = fdr;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

}
