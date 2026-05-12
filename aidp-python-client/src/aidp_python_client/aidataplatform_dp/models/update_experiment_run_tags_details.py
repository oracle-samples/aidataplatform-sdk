# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateExperimentRunTagsDetails(object):
    """
    Details of the ExperimentRun tags to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateExperimentRunTagsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this UpdateExperimentRunTagsDetails.
        :type run_id: str

        :param set_tags:
            The value to assign to the set_tags property of this UpdateExperimentRunTagsDetails.
        :type set_tags: list[oci.aidataplatform_dp.models.ExperimentRunTag]

        :param delete_tags:
            The value to assign to the delete_tags property of this UpdateExperimentRunTagsDetails.
        :type delete_tags: list[oci.aidataplatform_dp.models.ExperimentRunTagKey]

        """
        self.swagger_types = {
            'run_id': 'str',
            'set_tags': 'list[ExperimentRunTag]',
            'delete_tags': 'list[ExperimentRunTagKey]'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'set_tags': 'set_tags',
            'delete_tags': 'delete_tags'
        }

        self._run_id = None
        self._set_tags = None
        self._delete_tags = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this UpdateExperimentRunTagsDetails.
        Unique identifier for the run.


        :return: The run_id of this UpdateExperimentRunTagsDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this UpdateExperimentRunTagsDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this UpdateExperimentRunTagsDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def set_tags(self):
        """
        Gets the set_tags of this UpdateExperimentRunTagsDetails.
        ExperimentRun tags to set


        :return: The set_tags of this UpdateExperimentRunTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunTag]
        """
        return self._set_tags

    @set_tags.setter
    def set_tags(self, set_tags):
        """
        Sets the set_tags of this UpdateExperimentRunTagsDetails.
        ExperimentRun tags to set


        :param set_tags: The set_tags of this UpdateExperimentRunTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunTag]
        """
        self._set_tags = set_tags

    @property
    def delete_tags(self):
        """
        Gets the delete_tags of this UpdateExperimentRunTagsDetails.
        ExperimentRun tags to delete


        :return: The delete_tags of this UpdateExperimentRunTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunTagKey]
        """
        return self._delete_tags

    @delete_tags.setter
    def delete_tags(self, delete_tags):
        """
        Sets the delete_tags of this UpdateExperimentRunTagsDetails.
        ExperimentRun tags to delete


        :param delete_tags: The delete_tags of this UpdateExperimentRunTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunTagKey]
        """
        self._delete_tags = delete_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
