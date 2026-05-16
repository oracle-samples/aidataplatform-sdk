# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LogExperimentRunBatchDetails(object):
    """
    Run Batch data to log.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LogExperimentRunBatchDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this LogExperimentRunBatchDetails.
        :type run_id: str

        :param metrics:
            The value to assign to the metrics property of this LogExperimentRunBatchDetails.
        :type metrics: list[oci.aidataplatform_dp.models.ExperimentRunMetric]

        :param params:
            The value to assign to the params property of this LogExperimentRunBatchDetails.
        :type params: list[oci.aidataplatform_dp.models.ExperimentRunParam]

        :param tags:
            The value to assign to the tags property of this LogExperimentRunBatchDetails.
        :type tags: list[oci.aidataplatform_dp.models.ExperimentRunTag]

        """
        self.swagger_types = {
            'run_id': 'str',
            'metrics': 'list[ExperimentRunMetric]',
            'params': 'list[ExperimentRunParam]',
            'tags': 'list[ExperimentRunTag]'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'metrics': 'metrics',
            'params': 'params',
            'tags': 'tags'
        }

        self._run_id = None
        self._metrics = None
        self._params = None
        self._tags = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this LogExperimentRunBatchDetails.
        Unique identifier for the run.


        :return: The run_id of this LogExperimentRunBatchDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this LogExperimentRunBatchDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this LogExperimentRunBatchDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def metrics(self):
        """
        Gets the metrics of this LogExperimentRunBatchDetails.
        Metrics to log.


        :return: The metrics of this LogExperimentRunBatchDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunMetric]
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """
        Sets the metrics of this LogExperimentRunBatchDetails.
        Metrics to log.


        :param metrics: The metrics of this LogExperimentRunBatchDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunMetric]
        """
        self._metrics = metrics

    @property
    def params(self):
        """
        Gets the params of this LogExperimentRunBatchDetails.
        Params to log.


        :return: The params of this LogExperimentRunBatchDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunParam]
        """
        return self._params

    @params.setter
    def params(self, params):
        """
        Sets the params of this LogExperimentRunBatchDetails.
        Params to log.


        :param params: The params of this LogExperimentRunBatchDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunParam]
        """
        self._params = params

    @property
    def tags(self):
        """
        Gets the tags of this LogExperimentRunBatchDetails.
        Tags to log.


        :return: The tags of this LogExperimentRunBatchDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this LogExperimentRunBatchDetails.
        Tags to log.


        :param tags: The tags of this LogExperimentRunBatchDetails.
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
