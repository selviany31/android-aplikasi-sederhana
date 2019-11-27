package com.selviany.belajar.aseanprofiles;

import android.os.Parcel;
import android.os.Parcelable;

public class Asean implements Parcelable {

    private String country, desc, date, capital, land, population, language, currency;
    private int images;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public Asean() {

    }

    protected Asean(Parcel in) {
        country = in.readString();
        desc = in.readString();
        date = in.readString();
        capital = in.readString();
        land = in.readString();
        population = in.readString();
        language = in.readString();
        currency = in.readString();
        images = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(country);
        dest.writeString(desc);
        dest.writeString(date);
        dest.writeString(capital);
        dest.writeString(land);
        dest.writeString(population);
        dest.writeString(language);
        dest.writeString(currency);
        dest.writeInt(images);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Asean> CREATOR = new Creator<Asean>() {
        @Override
        public Asean createFromParcel(Parcel in) {
            return new Asean(in);
        }

        @Override
        public Asean[] newArray(int size) {
            return new Asean[size];
        }
    };
}
