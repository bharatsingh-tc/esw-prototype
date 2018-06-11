package tmt.sequencer.api

import tmt.sequencer.models.{Command, Id, Sequence}

import scala.concurrent.Future

trait SequenceEditor {
  def addAll(commands: List[Command]): Future[Unit]
  def pause(): Future[Unit]
  def resume(): Future[Unit]
  def reset(): Future[Unit]
  def sequence: Future[Sequence]
  def delete(ids: List[Id]): Future[Unit]
  def addBreakpoints(ids: List[Id]): Future[Unit]
  def removeBreakpoints(ids: List[Id]): Future[Unit]
  def insertAfter(id: Id, commands: List[Command]): Future[Unit]
  def prepend(commands: List[Command]): Future[Unit]
  def replace(id: Id, commands: List[Command]): Future[Unit]
  def shutdown(): Future[Unit]
}

object SequenceEditor {
  val ApiName           = "editor"
  val AddAll            = "addAll"
  val Pause             = "pause"
  val Resume            = "resume"
  val Reset             = "reset"
  val Sequence          = "sequence"
  val Delete            = "delete"
  val AddBreakpoints    = "addBreakpoints"
  val RemoveBreakpoints = "removeBreakpoints"
  val InsertAfter       = "insertAfter"
  val Prepend           = "prepend"
  val Replace           = "replace"
  val Shutdown          = "shutdown"
}
