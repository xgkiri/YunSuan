package yunsuan.encoding.Opcode

import chisel3._

object VialuOpcode {
  def width = 6

  def vadd   = 0.U (width.W)
  def vsub   = 1.U (width.W)
  def vext   = 2.U (width.W)
  def vadc   = 3.U (width.W)
  def vmadc  = 4.U (width.W)
  def vsbc   = 5.U (width.W)
  def vmsbc  = 6.U (width.W)
  def vand   = 7.U (width.W)
  def vnand  = 8.U (width.W)
  def vandn  = 9.U (width.W)
  def vxor   = 10.U(width.W)
  def vor    = 11.U(width.W)
  def vnor   = 12.U(width.W)
  def vorn   = 13.U(width.W)
  def vxnor  = 14.U(width.W)
  def vsll   = 15.U(width.W)
  def vsrl   = 16.U(width.W)
  def vsra   = 17.U(width.W)
  def vmseq  = 18.U(width.W)
  def vmsne  = 19.U(width.W)
  def vmslt  = 20.U(width.W)
  def vmsle  = 21.U(width.W)
  def vmsgt  = 22.U(width.W)
  def vmin   = 23.U(width.W)
  def vmax   = 24.U(width.W)
  def vmerge = 25.U(width.W)
  def vmv    = 26.U(width.W)
  def vsadd  = 27.U(width.W)
  def vssub  = 28.U(width.W)
  def vaadd  = 29.U(width.W)
  def vasub  = 30.U(width.W)
  def vssrl  = 31.U(width.W)
  def vssra  = 32.U(width.W)
  def vmvsx  = 46.U(width.W)
}
