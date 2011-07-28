
package com.webobjects.foundation;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public interface NSCoding {
    public static class _BigDecimalSupport extends _BigIntegerSupport {


        public _BigDecimalSupport() { return null; }

        private double _logBaseTen(double value) { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }

        static  {}

        private static final int _MaxMantissaSize = 16;
        private static final int _MaxByteDifference = 127;
        private static final double _LnTen;

    }

    public static class _BigIntegerSupport extends Support {


        public _BigIntegerSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }

        private static void _copyIntToByteArray(int anInt, byte bytes[], int offset) { return null; }

        private static void _copyShortToByteArray(short aShort, byte bytes[], int offset) { return null; }

        private static short _shortFromByteArray(byte bytes[], int offset) { return null; }

        protected static void _encodeBigInteger(NSCoder coder, BigInteger bigInteger) { return null; }

        protected static BigInteger _decodeBigInteger(NSCoder coder, int exponent) { return null; }

        private static final int _MaxShortArrayLength = 8;

    }

    public static class _DoubleSupport extends _NumberSupport {

        public _DoubleSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}
    }

    public static class _FloatSupport extends _NumberSupport {

        public _FloatSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}
    }

    public static class _LongSupport extends _NumberSupport {

        public _LongSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}
    }

    public static class _IntegerSupport extends _NumberSupport {

        public _IntegerSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}
    }

    public static class _ShortSupport extends _NumberSupport {

        public _ShortSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}
    }

    public static class _ByteSupport extends _NumberSupport {

        public _ByteSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}
    }

    public static class _NumberSupport extends Support {

        public _NumberSupport() { return null; }

        public Class classForCoder(Object receiver) { return null; }

        public void encodeWithCoder(Object obj, NSCoder nscoder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _CharacterSupport extends Support {

        public _CharacterSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _DateSupport extends Support {

        public _DateSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _StringSupport extends Support {

        public _StringSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _BooleanSupport extends Support {

        public _BooleanSupport() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static abstract class Support {


        public Support() { return null; }

        public static Support supportForClass(Class aClass) { return null; }

        public static void setSupportForClass(Support support, Class aClass) { return null; }

        public Class classForCoder(Object receiver) { return null; }

        public abstract void encodeWithCoder(Object obj, NSCoder nscoder);

        public abstract Object decodeObject(NSCoder nscoder);

        protected static void _encodeUTF8(String string, NSCoder coder) { return null; }

        protected static String _decodeUTF8(NSCoder coder) { return null; }

        static  {}

        private static NSMutableDictionary _supportByClass;
        private static final String _UTF8StringEncoding = "UTF8";

    }



    public abstract Class classForCoder();

    public abstract void encodeWithCoder(NSCoder nscoder);



    public static final Class _CLASS = null;

}
