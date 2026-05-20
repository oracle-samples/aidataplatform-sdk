# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentRun(object):
    """
    Details of an experiment run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentRun object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param info:
            The value to assign to the info property of this ExperimentRun.
        :type info: oci.aidataplatform_dp.models.ExperimentRunInfo

        :param data:
            The value to assign to the data property of this ExperimentRun.
        :type data: oci.aidataplatform_dp.models.ExperimentRunData

        :param inputs:
            The value to assign to the inputs property of this ExperimentRun.
        :type inputs: oci.aidataplatform_dp.models.ExperimentRunInputs

        :param outputs:
            The value to assign to the outputs property of this ExperimentRun.
        :type outputs: oci.aidataplatform_dp.models.ExperimentRunOutputs

        """
        self.swagger_types = {
            'info': 'ExperimentRunInfo',
            'data': 'ExperimentRunData',
            'inputs': 'ExperimentRunInputs',
            'outputs': 'ExperimentRunOutputs'
        }

        self.attribute_map = {
            'info': 'info',
            'data': 'data',
            'inputs': 'inputs',
            'outputs': 'outputs'
        }

        self._info = None
        self._data = None
        self._inputs = None
        self._outputs = None

    @property
    def info(self):
        """
        Gets the info of this ExperimentRun.

        :return: The info of this ExperimentRun.
        :rtype: oci.aidataplatform_dp.models.ExperimentRunInfo
        """
        return self._info

    @info.setter
    def info(self, info):
        """
        Sets the info of this ExperimentRun.

        :param info: The info of this ExperimentRun.
        :type: oci.aidataplatform_dp.models.ExperimentRunInfo
        """
        self._info = info

    @property
    def data(self):
        """
        Gets the data of this ExperimentRun.

        :return: The data of this ExperimentRun.
        :rtype: oci.aidataplatform_dp.models.ExperimentRunData
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this ExperimentRun.

        :param data: The data of this ExperimentRun.
        :type: oci.aidataplatform_dp.models.ExperimentRunData
        """
        self._data = data

    @property
    def inputs(self):
        """
        Gets the inputs of this ExperimentRun.

        :return: The inputs of this ExperimentRun.
        :rtype: oci.aidataplatform_dp.models.ExperimentRunInputs
        """
        return self._inputs

    @inputs.setter
    def inputs(self, inputs):
        """
        Sets the inputs of this ExperimentRun.

        :param inputs: The inputs of this ExperimentRun.
        :type: oci.aidataplatform_dp.models.ExperimentRunInputs
        """
        self._inputs = inputs

    @property
    def outputs(self):
        """
        Gets the outputs of this ExperimentRun.

        :return: The outputs of this ExperimentRun.
        :rtype: oci.aidataplatform_dp.models.ExperimentRunOutputs
        """
        return self._outputs

    @outputs.setter
    def outputs(self, outputs):
        """
        Sets the outputs of this ExperimentRun.

        :param outputs: The outputs of this ExperimentRun.
        :type: oci.aidataplatform_dp.models.ExperimentRunOutputs
        """
        self._outputs = outputs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
