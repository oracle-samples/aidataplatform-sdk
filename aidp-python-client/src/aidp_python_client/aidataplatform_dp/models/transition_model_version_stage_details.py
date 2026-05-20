# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TransitionModelVersionStageDetails(object):
    """
    Transition details of the model version.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TransitionModelVersionStageDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this TransitionModelVersionStageDetails.
        :type name: str

        :param version:
            The value to assign to the version property of this TransitionModelVersionStageDetails.
        :type version: str

        :param stage:
            The value to assign to the stage property of this TransitionModelVersionStageDetails.
        :type stage: str

        :param archive_existing_versions:
            The value to assign to the archive_existing_versions property of this TransitionModelVersionStageDetails.
        :type archive_existing_versions: bool

        """
        self.swagger_types = {
            'name': 'str',
            'version': 'str',
            'stage': 'str',
            'archive_existing_versions': 'bool'
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version',
            'stage': 'stage',
            'archive_existing_versions': 'archive_existing_versions'
        }

        self._name = None
        self._version = None
        self._stage = None
        self._archive_existing_versions = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this TransitionModelVersionStageDetails.
        Name of the registered model.


        :return: The name of this TransitionModelVersionStageDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this TransitionModelVersionStageDetails.
        Name of the registered model.


        :param name: The name of this TransitionModelVersionStageDetails.
        :type: str
        """
        self._name = name

    @property
    def version(self):
        """
        **[Required]** Gets the version of this TransitionModelVersionStageDetails.
        Model\u2019s version number.


        :return: The version of this TransitionModelVersionStageDetails.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this TransitionModelVersionStageDetails.
        Model\u2019s version number.


        :param version: The version of this TransitionModelVersionStageDetails.
        :type: str
        """
        self._version = version

    @property
    def stage(self):
        """
        **[Required]** Gets the stage of this TransitionModelVersionStageDetails.
        New stage for the model version.


        :return: The stage of this TransitionModelVersionStageDetails.
        :rtype: str
        """
        return self._stage

    @stage.setter
    def stage(self, stage):
        """
        Sets the stage of this TransitionModelVersionStageDetails.
        New stage for the model version.


        :param stage: The stage of this TransitionModelVersionStageDetails.
        :type: str
        """
        self._stage = stage

    @property
    def archive_existing_versions(self):
        """
        **[Required]** Gets the archive_existing_versions of this TransitionModelVersionStageDetails.
        Whether to archive existing versions in the target stage.


        :return: The archive_existing_versions of this TransitionModelVersionStageDetails.
        :rtype: bool
        """
        return self._archive_existing_versions

    @archive_existing_versions.setter
    def archive_existing_versions(self, archive_existing_versions):
        """
        Sets the archive_existing_versions of this TransitionModelVersionStageDetails.
        Whether to archive existing versions in the target stage.


        :param archive_existing_versions: The archive_existing_versions of this TransitionModelVersionStageDetails.
        :type: bool
        """
        self._archive_existing_versions = archive_existing_versions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
