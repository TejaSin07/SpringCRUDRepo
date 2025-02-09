package in.tejas.service;

import in.tejas.dao.BookDao;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	
	@Override
	public void saveBook() {
		// TODO Auto-generated method stub
		boolean status = bookDao.save();
		if(status) {
			System.out.println("Record inserted");
		}else {
			System.out.println("Insertion failed");
		}
		
	}
}
