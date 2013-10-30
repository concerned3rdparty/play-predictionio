package io.prediction.play

import io.prediction.Client

/**
 *
 * @author Filippo De Luca - me@filippodeluca.com
 */
trait ClientProvider {

  def withClient[T](f: Client => T): T

  def shutdown()

}
