package com.david.catemotion;

import android.os.Parcel;
import android.os.Parcelable;

//ctrl shift A
public class CatDetailItem implements Parcelable {
    public int image;
    public String description;

    public CatDetailItem(int image, String description) {
        this.image = image;
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
        dest.writeString(this.description);
    }

    protected CatDetailItem(Parcel in) {
        this.image = in.readInt();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<CatDetailItem> CREATOR = new Parcelable.Creator<CatDetailItem>() {
        @Override
        public CatDetailItem createFromParcel(Parcel source) {
            return new CatDetailItem(source);
        }

        @Override
        public CatDetailItem[] newArray(int size) {
            return new CatDetailItem[size];
        }
    };
}
