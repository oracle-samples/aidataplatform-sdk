# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentRunData(object):
    """
    Run data.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentRunData object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param metrics:
            The value to assign to the metrics property of this ExperimentRunData.
        :type metrics: list[oci.aidataplatform_dp.models.ExperimentRunMetric]

        :param params:
            The value to assign to the params property of this ExperimentRunData.
        :type params: list[oci.aidataplatform_dp.models.ExperimentRunParam]

        :param tags:
            The value to assign to the tags property of this ExperimentRunData.
        :type tags: list[oci.aidataplatform_dp.models.ExperimentRunTag]

        """
        self.swagger_types = {
            'metrics': 'list[ExperimentRunMetric]',
            'params': 'list[ExperimentRunParam]',
            'tags': 'list[ExperimentRunTag]'
        }

        self.attribute_map = {
            'metrics': 'metrics',
            'params': 'params',
            'tags': 'tags'
        }

        self._metrics = None
        self._params = None
        self._tags = None

    @property
    def metrics(self):
        """
        Gets the metrics of this ExperimentRunData.
        Metrics logged for the run.


        :return: The metrics of this ExperimentRunData.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunMetric]
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """
        Sets the metrics of this ExperimentRunData.
        Metrics logged for the run.


        :param metrics: The metrics of this ExperimentRunData.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunMetric]
        """
        self._metrics = metrics

    @property
    def params(self):
        """
        Gets the params of this ExperimentRunData.
        Parameters logged for the run.


        :return: The params of this ExperimentRunData.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunParam]
        """
        return self._params

    @params.setter
    def params(self, params):
        """
        Sets the params of this ExperimentRunData.
        Parameters logged for the run.


        :param params: The params of this ExperimentRunData.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunParam]
        """
        self._params = params

    @property
    def tags(self):
        """
        Gets the tags of this ExperimentRunData.
        Tags to log.


        :return: The tags of this ExperimentRunData.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this ExperimentRunData.
        Tags to log.


        :param tags: The tags of this ExperimentRunData.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunTag]
        """
        self._tags = tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
