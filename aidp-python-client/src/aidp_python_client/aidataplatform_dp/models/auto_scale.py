# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AutoScale(object):
    """
    Properties required to automatically scale the clusters up and down based on load.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AutoScale object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param min_workers:
            The value to assign to the min_workers property of this AutoScale.
        :type min_workers: int

        :param max_workers:
            The value to assign to the max_workers property of this AutoScale.
        :type max_workers: int

        """
        self.swagger_types = {
            'min_workers': 'int',
            'max_workers': 'int'
        }

        self.attribute_map = {
            'min_workers': 'minWorkers',
            'max_workers': 'maxWorkers'
        }

        self._min_workers = None
        self._max_workers = None

    @property
    def min_workers(self):
        """
        Gets the min_workers of this AutoScale.
        The minimum number of workers to which the cluster can scale down when underused.


        :return: The min_workers of this AutoScale.
        :rtype: int
        """
        return self._min_workers

    @min_workers.setter
    def min_workers(self, min_workers):
        """
        Sets the min_workers of this AutoScale.
        The minimum number of workers to which the cluster can scale down when underused.


        :param min_workers: The min_workers of this AutoScale.
        :type: int
        """
        self._min_workers = min_workers

    @property
    def max_workers(self):
        """
        Gets the max_workers of this AutoScale.
        The maximum number of workers to which the cluster can scale up when overloaded.


        :return: The max_workers of this AutoScale.
        :rtype: int
        """
        return self._max_workers

    @max_workers.setter
    def max_workers(self, max_workers):
        """
        Sets the max_workers of this AutoScale.
        The maximum number of workers to which the cluster can scale up when overloaded.


        :param max_workers: The max_workers of this AutoScale.
        :type: int
        """
        self._max_workers = max_workers

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
