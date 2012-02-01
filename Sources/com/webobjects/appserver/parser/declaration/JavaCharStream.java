package com.webobjects.appserver.parser.declaration;
/**
 * An implementation of interface CharStream, where the stream is assumed to contain only ASCII characters (with java-like unicode escape processing).
 */
public class JavaCharStream{
    protected int[] bufcolumn;

    protected char[] buffer;

    protected int[] bufline;

    public int bufpos;

    protected int column;

    protected int inBuf;

    protected java.io.Reader inputStream;

    protected int line;

    protected int maxNextCharInd;

    protected char[] nextCharBuf;

    protected int nextCharInd;

    protected boolean prevCharIsCR;

    protected boolean prevCharIsLF;

    public static final boolean staticFlag=false;

    protected int tabSize;

    public JavaCharStream(java.io.InputStream dstream){
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.InputStream dstream, int startline, int startcolumn){
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.InputStream dstream, int startline, int startcolumn, int buffersize){
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.InputStream dstream, java.lang.String encoding) throws java.io.UnsupportedEncodingException{
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.InputStream dstream, java.lang.String encoding, int startline, int startcolumn) throws java.io.UnsupportedEncodingException{
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.InputStream dstream, java.lang.String encoding, int startline, int startcolumn, int buffersize) throws java.io.UnsupportedEncodingException{
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.Reader dstream){
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.Reader dstream, int startline, int startcolumn){
         //TODO codavaj!!
    }

    public JavaCharStream(java.io.Reader dstream, int startline, int startcolumn, int buffersize){
         //TODO codavaj!!
    }

    /**
     * Method to adjust line and column numbers for the start of a token.
     */
    public void adjustBeginLineColumn(int newLine, int newCol){
        return; //TODO codavaj!!
    }

    protected void AdjustBuffSize(){
        return; //TODO codavaj!!
    }

    public void backup(int amount){
        return; //TODO codavaj!!
    }

    public char BeginToken() throws java.io.IOException{
        return ' '; //TODO codavaj!!
    }

    public void Done(){
        return; //TODO codavaj!!
    }

    protected void ExpandBuff(boolean wrapAround){
        return; //TODO codavaj!!
    }

    protected void FillBuff() throws java.io.IOException{
        return; //TODO codavaj!!
    }

    public int getBeginColumn(){
        return 0; //TODO codavaj!!
    }

    public int getBeginLine(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public int getColumn(){
        return 0; //TODO codavaj!!
    }

    public int getEndColumn(){
        return 0; //TODO codavaj!!
    }

    public int getEndLine(){
        return 0; //TODO codavaj!!
    }

    public java.lang.String GetImage(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public int getLine(){
        return 0; //TODO codavaj!!
    }

    public char[] GetSuffix(int len){
        return null; //TODO codavaj!!
    }

    protected int getTabSize(int i){
        return 0; //TODO codavaj!!
    }

    protected char ReadByte() throws java.io.IOException{
        return ' '; //TODO codavaj!!
    }

    public char readChar() throws java.io.IOException{
        return ' '; //TODO codavaj!!
    }

    public void ReInit(java.io.InputStream dstream){
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.InputStream dstream, int startline, int startcolumn){
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.InputStream dstream, int startline, int startcolumn, int buffersize){
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.InputStream dstream, java.lang.String encoding) throws java.io.UnsupportedEncodingException{
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.InputStream dstream, java.lang.String encoding, int startline, int startcolumn) throws java.io.UnsupportedEncodingException{
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.InputStream dstream, java.lang.String encoding, int startline, int startcolumn, int buffersize) throws java.io.UnsupportedEncodingException{
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.Reader dstream){
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.Reader dstream, int startline, int startcolumn){
        return; //TODO codavaj!!
    }

    public void ReInit(java.io.Reader dstream, int startline, int startcolumn, int buffersize){
        return; //TODO codavaj!!
    }

    protected void setTabSize(int i){
        return; //TODO codavaj!!
    }

    protected void UpdateLineColumn(char c){
        return; //TODO codavaj!!
    }

}
