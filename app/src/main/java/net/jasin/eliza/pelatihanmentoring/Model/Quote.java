package net.jasin.eliza.pelatihanmentoring.Model;

/**
 * Created by elizajasin on 24/05/2017.
 */

public class Quote {
    String nama, title, quote;

    public Quote(String nama, String title, String quote) {
        this.nama = nama;
        this.title = title;
        this.quote = quote;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
