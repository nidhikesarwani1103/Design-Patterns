package dev.nidhi.SOLID.ISP.DesignWithISP;

/*
 The interface is forcing classes to implement methods they don't need.
    WhatsApp only needs:
    - send
    - trackStatus

    But it is forced to implement:
    - schedule
    - cancel
    - resend

   ISP: Clients should not be forced to depend on methods they do not use.

    Or simpler:
        Prefer many small interfaces over one giant interface.
 */
class OrderService {

}
