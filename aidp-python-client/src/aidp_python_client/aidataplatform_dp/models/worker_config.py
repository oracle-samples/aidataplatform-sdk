# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkerConfig(object):
    """
    Worker configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new WorkerConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param worker_shape:
            The value to assign to the worker_shape property of this WorkerConfig.
        :type worker_shape: str

        :param worker_shape_config:
            The value to assign to the worker_shape_config property of this WorkerConfig.
        :type worker_shape_config: oci.aidataplatform_dp.models.ShapeConfig

        :param min_worker_count:
            The value to assign to the min_worker_count property of this WorkerConfig.
        :type min_worker_count: int

        :param max_worker_count:
            The value to assign to the max_worker_count property of this WorkerConfig.
        :type max_worker_count: int

        """
        self.swagger_types = {
            'worker_shape': 'str',
            'worker_shape_config': 'ShapeConfig',
            'min_worker_count': 'int',
            'max_worker_count': 'int'
        }

        self.attribute_map = {
            'worker_shape': 'workerShape',
            'worker_shape_config': 'workerShapeConfig',
            'min_worker_count': 'minWorkerCount',
            'max_worker_count': 'maxWorkerCount'
        }

        self._worker_shape = None
        self._worker_shape_config = None
        self._min_worker_count = None
        self._max_worker_count = None

    @property
    def worker_shape(self):
        """
        Gets the worker_shape of this WorkerConfig.
        Shape of the compute cluster executor instance.


        :return: The worker_shape of this WorkerConfig.
        :rtype: str
        """
        return self._worker_shape

    @worker_shape.setter
    def worker_shape(self, worker_shape):
        """
        Sets the worker_shape of this WorkerConfig.
        Shape of the compute cluster executor instance.


        :param worker_shape: The worker_shape of this WorkerConfig.
        :type: str
        """
        self._worker_shape = worker_shape

    @property
    def worker_shape_config(self):
        """
        Gets the worker_shape_config of this WorkerConfig.

        :return: The worker_shape_config of this WorkerConfig.
        :rtype: oci.aidataplatform_dp.models.ShapeConfig
        """
        return self._worker_shape_config

    @worker_shape_config.setter
    def worker_shape_config(self, worker_shape_config):
        """
        Sets the worker_shape_config of this WorkerConfig.

        :param worker_shape_config: The worker_shape_config of this WorkerConfig.
        :type: oci.aidataplatform_dp.models.ShapeConfig
        """
        self._worker_shape_config = worker_shape_config

    @property
    def min_worker_count(self):
        """
        Gets the min_worker_count of this WorkerConfig.
        Minimum number of workers.


        :return: The min_worker_count of this WorkerConfig.
        :rtype: int
        """
        return self._min_worker_count

    @min_worker_count.setter
    def min_worker_count(self, min_worker_count):
        """
        Sets the min_worker_count of this WorkerConfig.
        Minimum number of workers.


        :param min_worker_count: The min_worker_count of this WorkerConfig.
        :type: int
        """
        self._min_worker_count = min_worker_count

    @property
    def max_worker_count(self):
        """
        Gets the max_worker_count of this WorkerConfig.
        Maximum number of workers. When this property is specified, the cluster is auto-scaled.


        :return: The max_worker_count of this WorkerConfig.
        :rtype: int
        """
        return self._max_worker_count

    @max_worker_count.setter
    def max_worker_count(self, max_worker_count):
        """
        Sets the max_worker_count of this WorkerConfig.
        Maximum number of workers. When this property is specified, the cluster is auto-scaled.


        :param max_worker_count: The max_worker_count of this WorkerConfig.
        :type: int
        """
        self._max_worker_count = max_worker_count

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
