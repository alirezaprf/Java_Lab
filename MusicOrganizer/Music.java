package MusicOrganizer;
public class Music{
    private String file,singer;
    private int releaseYear;
    
    public Music(String File,String Singer,int Year)
    {
        setFile(File);
        setSinger(Singer);
        setReleaseYear(Year);
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub

        Music m=(Music)obj;
        return (releaseYear==m.releaseYear &&
        file.equals(m.getFile())  
        && singer.equals(m.getSinger()));
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}