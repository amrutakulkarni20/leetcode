class BookingModel {
    private String bookingId;
    private String description;
    private String department;

    public BookingModel(String bookingId, String description, String department) {
        this.bookingId = bookingId;
        this.description = description;
        this.department = department;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
