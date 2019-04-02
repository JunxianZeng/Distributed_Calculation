package Test1;

/**
 * ZengJunxian
 * 2019/4/2 14:59
 */
class Factory {
    static Hotel getRoom(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       Hotel hotel=null;
        hotel=(Hotel) Class.forName(classname).newInstance();
        return hotel;
    }
}
